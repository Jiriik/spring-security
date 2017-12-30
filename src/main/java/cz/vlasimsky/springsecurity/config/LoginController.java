package cz.vlasimsky.springsecurity.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showLogin")
    public String showLogin() {
        return "fancy-login";
    }
}
