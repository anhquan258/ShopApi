package com.example.shopapi.Repository;

import com.example.shopapi.Model.Product;
import com.example.shopapi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
