package com.greeting.demo.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greeting.demo.Model.Greeting;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	/**
	 * Get method to return JSON
	 * @param name
	 * @return
	 */
	@GetMapping(value = {"","/","/home"})
	public Greeting greeting (@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting (counter.incrementAndGet(),String.format(template, name));
	}
	
	/**
	 * post method to post details through JSON
	 * @param name
	 * @return
	 */
	@PostMapping("/postDetails")
	public Greeting greetings(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting (counter.incrementAndGet(),String.format(template, name));
	}
	
	/**
	 * put method to update details of JSON file
	 * @param name
	 * @return
	 */
	@PutMapping("/update")
	public Greeting greet(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting (counter.incrementAndGet(),String.format(template, name));
	}
}