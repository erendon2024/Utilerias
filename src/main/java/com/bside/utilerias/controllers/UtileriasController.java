package com.bside.utilerias.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtileriasController {
    
	@GetMapping("/Probando")
	public ResponseEntity<String> helloPrueba(){
		return new ResponseEntity<String>("Hola mundo desde github",HttpStatus.OK);
	}
  

}
