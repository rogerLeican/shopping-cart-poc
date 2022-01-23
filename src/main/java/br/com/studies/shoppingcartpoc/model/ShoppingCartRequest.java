package br.com.studies.shoppingcartpoc.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class ShoppingCartRequest {
//    private String objectId;
    private Integer id;
    private List<Product> products;
}