package com.controller;


import com.model.Product;
import com.service.ProductService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log
@RestController
public class ProductController {
    @Autowired
    final private ProductService productService;

    public ProductController(ProductService productService) {

        this.productService = productService;
    }
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/product")
    public List<Product> getProduct() {
        return productService.findAll();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/sla")
    public String  getSla() {
        return productService.isSla();
    }





//    @PostMapping(value="/add")
//    public String addProduct(){
//       return productService.isAddProduct();
//
//    }

}