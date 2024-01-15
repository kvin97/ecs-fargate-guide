package com.learning.ecsfargateguide.controller;

import com.learning.ecsfargateguide.dto.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("/users")
    public List<UserResponse> getUsers() {
        return Arrays.asList(
                UserResponse.builder().id(1).name("John")
                        .age(32).hobby("Cricket")
                        .profession("Teacher").build(),
                UserResponse.builder().id(2).name("Jane")
                        .age(23).hobby("Netball")
                        .profession("Nurse").build()
        );
    }
}
