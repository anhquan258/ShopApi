package com.example.shopapi.Controllers;

import com.example.shopapi.Model.Product;
import com.example.shopapi.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping(path = "/getproduct")
    public ResponseEntity<?> finAll(){
        List<Product> products = productService.getListProduct();
        return ResponseEntity.ok(products);
    }

}
