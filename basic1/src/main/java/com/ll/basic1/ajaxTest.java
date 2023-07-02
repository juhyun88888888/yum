package com.ll.basic1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ajaxTest {


    @GetMapping("/ajax_view")
    public String ajax_view(){
        return "ajax_view";
    }

    @PostMapping("/ajax_view")
    public String ajax_view(@RequestParam String data){
        System.out.println(data);
        return "redirect:http://localhost:8080/ajax_view";
    }

    @GetMapping("/multi_box_ajax")
    public String multiboxajax(){
        return "multi_box_ajax";
    }

//    @GetMapping("/main1")
//    public String main1(){
//        return "main1";
//    }
//
//    @PostMapping("/main1")
//    public String main1(@RequestParam String data){
//        return "redirect:http://localhost:8080/main1";
//    }
}
