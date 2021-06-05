package pl.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.company.dto.LoginDto;

@Controller
@RequestMapping(path = "/")
public class HomeController {

    @GetMapping
    public String welcomePage(Model model) {
        model.addAttribute("loginDto", new LoginDto());
        return "page/welcomePage";
    }

}
