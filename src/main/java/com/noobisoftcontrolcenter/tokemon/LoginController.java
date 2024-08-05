package com.noobisoftcontrolcenter.tokemon;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@ApiOperation("Login controller")
@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @ApiOperation("Login endpoint")
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String accountId) {
        User user = userRepository.findById(email).orElse(null);

        if (user != null && user.getAccountId().equals(accountId)) {
            return "Login successful for user: " + email;
        } else {
            return "Invalid email or account ID";
        }
    }
}