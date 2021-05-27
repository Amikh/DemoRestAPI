package com.service;

import com.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService  {

    public List<Product> findAll(){
        List<Product> list = new ArrayList<>();
        list.add(new Product(101,"Mob",9000.0));
        return list;
    }






}
