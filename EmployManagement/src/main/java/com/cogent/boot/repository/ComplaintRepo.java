package com.cogent.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Complaint;

@Repository
public interface ComplaintRepo extends JpaRepository<Complaint, Long> {

}
