package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wuttiTARN on 3/27/2016 AD.
 */
public interface ProductRepository extends JpaRepository <Product, Long>{

}
