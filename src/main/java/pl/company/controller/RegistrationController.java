package pl.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import pl.company.model.User;
import pl.company.dto.RegistrationDto;
import pl.company.repository.UserRepository;

@Controller
@RequestMapping(path = "/register")
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String register(Model model) {//Trzeba przekazac obiekt do widoku wiec potrzebujemy model
        model.addAttribute("registerDto", new RegistrationDto());
        return "registration/registrationForm";
    }

    @PostMapping
    public String postRegister(@ModelAttribute RegistrationDto registrationDto, BindingResult bindingResult) {
        System.out.println(registrationDto);

        if (bindingResult.hasErrors()) {
            return "registration/registrationForm";
        }

        boolean passwordEqual = registrationDto.getPassword().equals(registrationDto.getPasswordRepeat());
        if (!passwordEqual) {
            bindingResult.addError(new ObjectError("password", "Zle haslo"));
            return "registration/registrationForm";
        }

        User user = new User();
        user.setUserName(registrationDto.getLogin());
        user.setEmail(registrationDto.getEmail());
        user.setHashedPassword(registrationDto.getPassword());

        userRepository.save(user);
        return "redirect:/login";
    }

}
