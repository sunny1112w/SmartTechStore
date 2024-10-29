package com.sunnny.SmartTechStore.dto;

import jakarta.validation.constraints.NotEmpty;

public class CategoryDTO {
    @NotEmpty(message = "Category's name cannot be empty")
    private String name;
}
