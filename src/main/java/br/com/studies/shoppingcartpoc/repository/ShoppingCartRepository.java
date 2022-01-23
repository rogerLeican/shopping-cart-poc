package br.com.studies.shoppingcartpoc.repository;

import br.com.studies.shoppingcartpoc.repository.entity.ShoppingCartEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends MongoRepository<ShoppingCartEntity, String> {
}