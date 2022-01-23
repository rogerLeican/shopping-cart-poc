package br.com.studies.shoppingcartpoc.controller.v1;

import br.com.studies.shoppingcartpoc.model.ShoppingCartRequest;
import br.com.studies.shoppingcartpoc.model.ShoppingCartResponse;
import br.com.studies.shoppingcartpoc.service.ShoppingCartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class ShoppingCartRestController {

    private final ShoppingCartService shoppingCartService;
    
    @PostMapping
    public ShoppingCartResponse saveShoppingCart(@RequestBody
        ShoppingCartRequest shoppingCartRequest) {
        return shoppingCartService.saveShoppingCart(shoppingCartRequest);
    }
    
    @GetMapping
    public ShoppingCartResponse getShoppingCart(String id) {
        return shoppingCartService.getShoppingCart(id);
    }

}