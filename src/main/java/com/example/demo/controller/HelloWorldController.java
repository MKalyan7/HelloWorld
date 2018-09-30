package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Actor;
import com.example.demo.repository.ActorRepository;
@RestController
public class HelloWorldController {
	
	@Autowired
	private ActorRepository actorRepository;
	
	@RequestMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    	
	}

	@RequestMapping("/getActorsList")
    public List<Actor> getActors() {
        return actorRepository.findAll();
    	
	}
}
