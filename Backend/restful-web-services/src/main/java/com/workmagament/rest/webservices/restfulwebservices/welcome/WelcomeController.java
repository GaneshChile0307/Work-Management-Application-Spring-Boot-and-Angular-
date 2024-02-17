package com.workmagament.rest.webservices.restfulwebservices.welcome;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class WelcomeController {

    @GetMapping(path = "/welcome-bean")
    public WelcomeBean helloWorldBean() {
        //throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        return new WelcomeBean("Welcome User");
    }

    ///welcome/path-variable/user
    @GetMapping(path = "/welcome-bean/path-variable/{name}")
    public WelcomeBean helloWorldPathVariable(@PathVariable String name) {
        return new WelcomeBean(String.format("Hello World, %s", name));
    }

}
