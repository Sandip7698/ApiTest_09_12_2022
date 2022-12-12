package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Api;

public interface ApiRepository extends JpaRepository<Api,Long>{

	@Query(value="select email,password from api",nativeQuery=true)
	List<String> findAllemails();

}
