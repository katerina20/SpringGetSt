package com.netcr.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Flower {
    private Long id;
    private String name;
    private String color;

}
