package com.passwordvalidator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.passwordvalidator.service.ServicePassword;

@RestController
@RequestMapping("/api")

public class ControllerValidator {
 
    @PostMapping("/validate")   
    public ResponseEntity<Boolean> validatePassword(@RequestBody PasswordRequest passwordRequest) {
        boolean isValid = ServicePassword.isValid(passwordRequest.getPassword());
        return ResponseEntity.ok(isValid);
    }

    public static class PasswordRequest {
        private String password;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
