package com.jojoldu.book.controller;

import com.jojoldu.book.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
        public String hello(){
            return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount){

        HelloResponseDto dto = new HelloResponseDto();

        dto.setAmount(1000);
        dto.setName("hello");

        return dto;
    }
}
