package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class DateController {
    @GetMapping("date/today")
    public String getToday(Model model) {
        model.addAttribute("day", LocalDate.now().getDayOfWeek());
        return "showtoday";
    }

    @GetMapping("date/friday")
    public String isFriday(Model model) {
        model.addAttribute("day", LocalDate.now().getDayOfWeek());
        return "isitfriday";
    }

    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }
}
