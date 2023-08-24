package com.flutter.flutter.repository;



import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.flutter.flutter.model.Number;

@Repository
public interface NumberRepository extends CrudRepository<Number, Long> {
    Number findTopByOrderByIdDesc();
  
}
