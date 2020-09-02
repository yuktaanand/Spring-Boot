package org.example.controller;

import org.example.service.WelcomeService;
import org.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class WelcomeController{

    // JAR Dependency(Maven stores Dependency in form of JARS)
    // private WelcomeService service = new WelcomeService();

//    Now I don't want this new thing..so in some way I want to make some instance of WelcomeService and inject it here..so I can make different
//    implementations of WelcomeService and use in Welcome Controller

    //Injected Here, Auto wiring
    @Autowired
    private WelcomeService service; // this is also Inversion of Control(IoC) as either WelcomeController used to make instance of
    // WelcomeService but now dependency injection framework will do that for us

    @RequestMapping("/welcome")
    public String welcome(){
        return service.retrieveWelcomeMessage();
//        return "This is a welcome method in WelcomeController";
    }

    private static Map< String,Product > product = new HashMap< String,Product>();
    static {
        Product honey = new Product();
        honey.setId(1);
        honey.setName("honey");
        product.put(honey.Name, honey);

        Product almond = new Product();
        almond.setId(2);
        almond.setName("almond");
        product.put(almond.Name, almond);
//        System.out.println(product.values());
    }
    //        productMap.put(honey.gtId(),honey);
    @RequestMapping(value="/products")
    public ResponseEntity<Object> getProduct(){
        return new ResponseEntity<>(product.values(), HttpStatus.OK);
    }


    @GetMapping("/message")
    Product send(){
//        Product response = new Product(1,"get message honey");
        Product response = new Product();
        System.out.println(response);
        return response;
    }

    @PostMapping("/message")
    Product echo(@RequestBody Product message){
        return message;
    }
}

