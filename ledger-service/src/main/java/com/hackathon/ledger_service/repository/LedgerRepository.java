package com.hackathon.ledger_service.repository;

import com.hackathon.ledger_service.entity.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LedgerRepository extends JpaRepository<Ledger, Long> {
}
