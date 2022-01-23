package br.com.studies.shoppingcartpoc.repository.entity;

import java.util.List;

import br.com.studies.shoppingcartpoc.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Document(collection = "shopping-cart")
public class ShoppingCartEntity {
    
    @Id
//    private String objectId;
    private Integer id;
    private List<Product> products;
    private Double total;
}