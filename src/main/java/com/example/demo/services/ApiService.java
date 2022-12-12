package com.example.demo.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.Apidto;
import com.example.demo.model.Api;

public interface ApiService {

	ResponseEntity<String> save(Apidto apidto);

	List<String> findallemail();

}
