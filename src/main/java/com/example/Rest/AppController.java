package com.example.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/done")
	public String getMethod(){
		return "Done!!!";
	}
}
