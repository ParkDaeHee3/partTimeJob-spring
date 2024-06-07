package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/day1")
    public String day1() {
        return "day1";
    }

    @GetMapping("/day2")
    public String day2() {
        return "day2";
    }

    @GetMapping("/day3")
    public String day3() {
        return "day3";
    }

    @GetMapping("/day4")
    public String day4() {
        return "day4";
    }

    @GetMapping("/day5")
    public String day5() {
        return "day5";
    }

    @GetMapping("/day6")
    public String day6() {
        return "day6";
    }

    @GetMapping("/day7")
    public String day7() {
        return "day7";
    }
}