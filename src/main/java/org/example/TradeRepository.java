package org.example;

import org.example.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
// Взаимодействие с базой
public interface TradeRepository extends JpaRepository<Trade, Long> {
    Trade findByUid(String uid); // Метод для поиска по uid
}



