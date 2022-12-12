package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ApiRepository;
import com.example.demo.dto.Apidto;
import com.example.demo.model.Api;
import com.example.demo.services.ApiService;
@Service
public class ApiServiceImpl implements ApiService {
@Autowired
ApiRepository apiRepository;

@Override
public ResponseEntity<String> save(Apidto apidto) {
	Api api=new Api();
	api.setEmail(apidto.getEmail());
	api.setPassword(apidto.getPassword());
	apiRepository.save(api);
	return new ResponseEntity<>("Data Saved Sucessfully...",HttpStatus.OK);
}

@Override
public List<String> findallemail() {
	
	return apiRepository.findAllemails();
}
}
