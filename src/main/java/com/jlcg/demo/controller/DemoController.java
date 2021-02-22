package com.jlcg.demo.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jlcg.demo.model.PingResponse;



@RestController
@RequestMapping("demo")
public class DemoController {

	@RequestMapping(value = "/ping", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseStatus(value = HttpStatus.OK)
	// Prueba Rafa
	public PingResponse ping(@RequestParam(value = "input", required = true) String input) {
		return new PingResponse(new Date(), input);
	}
	
}
