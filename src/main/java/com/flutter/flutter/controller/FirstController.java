package com.flutter.flutter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flutter.flutter.model.Number;
import com.flutter.flutter.repository.NumberRepository;

@RestController
public class FirstController {

    @Autowired
    private NumberRepository numberRepository;

    @GetMapping("/all")
    public Iterable<Number> getAll() {
        return numberRepository.findAll();
    }

    @GetMapping("/")
    public Number getNumber() {
        return numberRepository.findTopByOrderByIdDesc();
    }
    
    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
	public Number addNumber(@RequestBody Number number) {
		return numberRepository.save(number);
	}
}
