package br.com.studies.shoppingcartpoc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Product {
    private String name;
    private String description;
    private String image;
    private String price;
    private String category;
}