package edu.fra.uas.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //lauscht bspw. auf http request
public class HelloWorldController {

    @RequestMapping(value = "hello", method = RequestMethod.GET) // NUr über diese bedien requests
    @ResponseBody //wird in den http code unten rein gepackt
    public String getHelloWorld(){
        return "<h1>Hello World Spring Boot!<h1>";
    }
}
