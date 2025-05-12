package com.example.oauth2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForestRepository extends JpaRepository<Forest, Integer> {

} 
