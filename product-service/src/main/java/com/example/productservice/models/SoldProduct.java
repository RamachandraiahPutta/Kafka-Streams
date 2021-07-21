package com.example.productservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// Lombok plugins annotations to create
// boiler plate codes (getters, setter, hashcode, equal, ...)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SoldProduct implements Serializable {

    private static final long serialVersionUID = -7680637768557787325L;

    private Integer id;
    private String name;
    private Integer price;
}
