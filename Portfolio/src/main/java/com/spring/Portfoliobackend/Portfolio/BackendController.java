package com.spring.Portfoliobackend.Portfolio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

	
	@RequestMapping("/action")
	
	public String sendDefaultResponse() {
		
		return "Working";
		
	}
	
}
