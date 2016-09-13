package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author David Turanski
 **/
@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String hello() {
		return "hello, world";
	}
}
