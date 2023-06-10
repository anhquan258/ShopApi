package com.example.shopapi.Services;

import com.example.shopapi.Model.Product;
import com.example.shopapi.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getListProduct() {
        List<Product> products=productRepository.findAll();
        return products;
    }
}
