package com.cogent.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Celebration;

@Repository
public interface CelebrationRepo extends JpaRepository<Celebration, Long>{

	@Query(value = "SELECT * FROM celebration ORDER BY name", nativeQuery = true)
	public List<Celebration> displayAll();
	
}
