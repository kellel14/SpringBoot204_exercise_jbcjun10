package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/carform")
    public String loadMyCarForm(Model model){
        model.addAttribute("MyCar", new myCar());
        return "carform";
    }

    @PostMapping("/carform")
    public String processMyCarForm(@Valid myCar MyCar, BindingResult result){

        if (result.hasErrors()){
        }
        return "myCarconfirm";

    }



}
