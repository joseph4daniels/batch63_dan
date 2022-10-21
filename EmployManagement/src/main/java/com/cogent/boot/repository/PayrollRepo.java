package com.cogent.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Payroll;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Long> {

}
