package com.ll.basic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    private int count1 = 0;
    private int count2 = 0;

    @GetMapping("/main1")
    public String showMain1(Model model) {
        count1++;
        model.addAttribute("count1",count1);
        count2++;
        model.addAttribute("count2",count2);
        return "main1";
    }
    @GetMapping("/count1")
    @ResponseBody
    public RsData getcount1(Model model){
        RsData data= new RsData<>("S-1","content-msg",++count1);
        return data;
    }

    @GetMapping("/count2")
    @ResponseBody
    public RsData getcount2(Model model){
        RsData data= new RsData<>("S-1","content-msg",++count2);
        return data;
    }
}