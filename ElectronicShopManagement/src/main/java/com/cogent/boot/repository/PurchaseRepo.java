package com.cogent.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.boot.entity.Purchase;

public interface PurchaseRepo extends JpaRepository<Purchase, Long> {

}
