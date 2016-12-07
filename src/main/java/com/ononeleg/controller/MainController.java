package com.ononeleg.controller;

/**
 * Created by ilya on 07/12/2016.
 */
import java.util.concurrent.atomic.AtomicLong;

import com.ononeleg.beans.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/test")
    public Response test(@RequestParam(value="name", defaultValue="00TestResponse") String name) {
        return new Response("1",name,"Shoes");
    }
        // tester

}