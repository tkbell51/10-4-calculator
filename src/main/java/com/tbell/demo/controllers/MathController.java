package com.tbell.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathController {

    @RequestMapping("/")
    public String index(@RequestParam(value="firstNum", required = false)String firstNum,
                        @RequestParam(value="operator", required = false)String operator,
                        @RequestParam(value="secNum", required = false)String secNum,
                        ModelMap model){

        System.out.println(firstNum);
        System.out.println(operator);
        System.out.println(secNum);

        Operations math = new Operations(firstNum,secNum,operator);
        Double results = math.doMath(firstNum,secNum, operator);

        System.out.println(math.doMath(firstNum,secNum, operator));
        model.addAttribute("pageData", firstNum + " " + operator + " " +
                secNum + " = " + results);
        model.addAttribute("resultsData", results);
        return "index";
    }

}
