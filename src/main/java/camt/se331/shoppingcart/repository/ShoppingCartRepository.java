package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by TOP on 28/3/2559.
 */
public interface ShoppingCartRepository  extends JpaRepository<ShoppingCart,Long> {
}


