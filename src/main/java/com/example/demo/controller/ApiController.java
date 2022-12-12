package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Apidto;
import com.example.demo.model.Api;
import com.example.demo.services.ApiService;

@RestController
public class ApiController {
@Autowired
ApiService apiService;

@PostMapping("/save")
public ResponseEntity<String> save(@RequestBody Apidto apidto){
	return apiService.save(apidto);
}

@GetMapping("/email")
public List<String> findemails(){
	return apiService.findallemail();
}
}
