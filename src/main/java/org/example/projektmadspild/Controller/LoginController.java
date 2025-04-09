package org.example.projektmadspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String authentifaceUser(@RequestParam String username, @RequestParam String password) {
        // Replace this with real authentication logic, e.g., checking against a database
        if ("admin".equals(username) && "password".equals(password)) {
            return "redirect:/"; // Redirect to the home page on successful login
        } else {
            return "login";
        }
    }
}
