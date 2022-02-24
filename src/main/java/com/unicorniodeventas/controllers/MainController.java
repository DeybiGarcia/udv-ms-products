/**
 * 
 */
package com.unicorniodeventas.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unicorniodeventas.response.UnicornioDeVentasResponse;

/**
 * @author Deybi Garcia
 *
 */
@RestController	
@RequestMapping(path = "/unicorniodeventas")
public class MainController {
	
	@GetMapping(path = "/isAuthorised", produces = MediaType.APPLICATION_JSON_VALUE)
	public UnicornioDeVentasResponse isAuthorised(@RequestParam(value="msg") String requestMessage ) {
		UnicornioDeVentasResponse response = new UnicornioDeVentasResponse();
		response.setCode(200);
		response.setMessage("you are authorised");
		response.setStatus(true);
		return response;
		
	}

	
	@PostMapping("/post")
	public String helloPost(@RequestBody final String hello) {
		return hello;
	}
}
