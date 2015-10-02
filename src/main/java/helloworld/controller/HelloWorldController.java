package helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Verne.George on 10/1/2015.
 */
@RestController
@RequestMapping(value = "/helloworld")
public class HelloWorldController {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ResponseEntity<Greet> sayHi(){
        Greet greet = new Greet("Hi!");
        ResponseEntity<Greet> response = new ResponseEntity<Greet>(greet, HttpStatus.OK);
        return response;
    }
}
