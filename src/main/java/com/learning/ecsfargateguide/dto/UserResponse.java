package com.learning.ecsfargateguide.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserResponse {
    private int id;
    private String name;
    private int age;
    private String profession;
    private String hobby;
}
