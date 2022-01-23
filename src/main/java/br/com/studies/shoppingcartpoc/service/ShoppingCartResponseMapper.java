package br.com.studies.shoppingcartpoc.service;

import br.com.studies.shoppingcartpoc.model.ShoppingCartRequest;
import br.com.studies.shoppingcartpoc.model.ShoppingCartResponse;
import br.com.studies.shoppingcartpoc.repository.entity.ShoppingCartEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShoppingCartResponseMapper {
    
    static ShoppingCartResponse mapFrom(ShoppingCartEntity shoppingCartEntity) {
        return Mappers.getMapper(ShoppingCartResponseMapper.class).map(shoppingCartEntity);
    }
    
    static ShoppingCartEntity mapFrom(ShoppingCartRequest shoppingCartRequest) {
        return Mappers.getMapper(ShoppingCartResponseMapper.class).mapToEntity(shoppingCartRequest);
    }
    
    ShoppingCartResponse map(ShoppingCartEntity shoppingCartEntity);
    
    ShoppingCartEntity mapToEntity(ShoppingCartRequest shoppingCartRequest);
}