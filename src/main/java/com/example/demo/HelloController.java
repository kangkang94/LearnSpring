package com.example.demo;

import org.springframework.web.bind.annotation.*;

/**
 * Created by kang on 17/10/1.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello world";
    }

}
