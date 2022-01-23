package br.com.studies.shoppingcartpoc.service;

import br.com.studies.shoppingcartpoc.model.ShoppingCartRequest;
import br.com.studies.shoppingcartpoc.model.ShoppingCartResponse;
import br.com.studies.shoppingcartpoc.repository.ShoppingCartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ShoppingCartService {
   private final ShoppingCartRepository repository;
    
    public ShoppingCartResponse saveShoppingCart(ShoppingCartRequest shoppingCartRequest) {
        return ShoppingCartResponseMapper
            .mapFrom(repository.save(ShoppingCartResponseMapper.mapFrom(shoppingCartRequest)));
    }
    
    public ShoppingCartResponse getShoppingCart(String id) {
        return repository.findById(id)
            .map(ShoppingCartResponseMapper::mapFrom)
            .orElseThrow(()-> new RuntimeException("Shopping cart not found"));
    }
}