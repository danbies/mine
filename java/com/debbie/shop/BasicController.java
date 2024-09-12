package com.debbie.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello(){
        return "index.html";
    }
    
    @GetMapping("/about")
    @ResponseBody
    String me(){
        return "나는 김단비";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String minepage(){
        return "마이페이지여유";
    }

    @GetMapping("/date")
    @ResponseBody
    String today(){
        return LocalDateTime.now().toString();
    }
}
