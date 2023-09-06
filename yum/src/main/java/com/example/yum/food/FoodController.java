package com.example.yum.food;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class FoodController {


    @GetMapping("/food/create")
    public String newFood(){

        return "create_form";
    }

    @PostMapping("/food/create")
    public String newFoodCreate(){

        return "redirect:/";
    }

}
