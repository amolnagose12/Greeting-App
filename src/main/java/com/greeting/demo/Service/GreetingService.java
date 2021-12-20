package com.greeting.demo.Service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.greeting.demo.Model.Greeting;
import com.greeting.demo.Service.IGreetingService;

@Service
public class GreetingService implements IGreetingService {
	 private static final String template = "Hello world";
	 private final AtomicLong counter = new AtomicLong();
	 
	 public Greeting greetingMessage() {
		 return new Greeting(counter.incrementAndGet(), String.format(template));
	 }
}