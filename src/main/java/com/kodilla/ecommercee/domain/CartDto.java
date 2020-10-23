package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class CartDto {
    private Long Id;
    private Long userId;
    private List<Product> productsInCart;
}