package com.stackroute.websocket_demo.controller;

import com.stackroute.websocket_demo.model.Greetings;
import com.stackroute.websocket_demo.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greetings greeting(HelloMessage message) throws InterruptedException {

        Thread.sleep(1000);
        return new Greetings("Hello, " + HtmlUtils.htmlEscape(message.getMessage() + "!"));
    }
}
