package com.qsp.Spring_Boot_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hi")
	public String welcome()
	{
		return "Hello";
	}

}
