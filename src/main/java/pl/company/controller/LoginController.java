package pl.company.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.company.dto.LoginDto;
import pl.company.model.User;
import pl.company.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/login")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String login(Model model) {//Trzeba przekazac obiekt do widoku wiec potrzebujemy model
        model.addAttribute("loginDto", new LoginDto());
        return "login/loginForm";
    }

    @PostMapping
    public String postLogin(@ModelAttribute LoginDto loginDto, HttpServletRequest request) {
        User user = userRepository.findByUserName(loginDto.getLogin());
        if (user == null) {
            return "login/error";
        }

        String userPassword = user.getPassword();
        boolean checkpw = BCrypt.checkpw(loginDto.getPassword(), userPassword);
        if (checkpw) {
            request.getSession(true).setAttribute("loggedIn",true);
            return "/page/correctLogin";
        } else {
            return "/login/error";
        }

    }

}

//zamiast zly user zle haslo przekierowanie do tego widoku