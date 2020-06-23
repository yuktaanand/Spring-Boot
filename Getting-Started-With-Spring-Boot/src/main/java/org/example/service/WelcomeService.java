package org.example.service;

import org.springframework.stereotype.Component;

//Spring is used to manage this bean and create and instance of this
@Component
public class WelcomeService{
    public String retrieveWelcomeMessage() {
        //Some Complex Business Logic
        return "This is WelcomeController dependency named WelcomeService after autowiring and using Component Scan";
    }
}