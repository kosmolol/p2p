package org.example;

import org.example.Trade;
import org.example.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

//Рест контроллер
@RestController
@RequestMapping("/api/trades")
public class ExchangeController {

    @Autowired
    private TradeRepository tradeRepository;
// Получение всех ордеров
    @GetMapping
    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }


// Создание ордера
    @PostMapping
    public ResponseEntity<Map<String, String>> createTrade(@RequestBody Trade trade) {
        Trade savedTrade = tradeRepository.save(trade);
        Map<String, String> response = new HashMap<>();
        response.put("uid", savedTrade.getUid()); // Добавляем uid в ответ
        return ResponseEntity.ok(response); // Возвращаем ответ в формате JSON
    }

// Рес метод получения ордера по УИД
    @GetMapping("/{uid}")
    public ResponseEntity<Trade> getTradeByUid(@PathVariable String uid) {
        Trade trade = tradeRepository.findByUid(uid); // Предполагается, что вы добавили этот метод в TradeRepository
        if (trade != null) {
            return ResponseEntity.ok(trade);
        } else {
            return ResponseEntity.notFound().build(); // Возвращаем 404, если не найден
        }
    }


}
