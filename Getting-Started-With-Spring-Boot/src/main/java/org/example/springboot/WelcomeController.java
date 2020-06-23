package org.example.springboot;

import org.example.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController{

    // JAR Dependency(Maven stores Dependency in form of JARS)
    // private WelcomeService service = new WelcomeService();

//    Now I don't want this new thing..so in some way I want to make some instance of WelcomeService and inject it here..so I can make different
//    implementations of WelcomeService and use in Welcome Controller

    //Injected Here, Auto wiring
    @Autowired
    private WelcomeService service;

    @RequestMapping("/welcome")
    public String welcome(){
        return service.retrieveWelcomeMessage();
//        return "This is a welcome method in WelcomeController";
    }
}

