package org.example;

import org.example.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
// Взаимодействие с базой H2
public interface TradeRepository extends JpaRepository<Trade, Long> {
    Trade findByUid(String uid); // Метод для поиска по uid
}



