package com;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Override
    public List<Product> findAll(){
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(100, "Mobile", 9000.00));
        products.add(new Product(101, "Smart TV", 60000.00));
        products.add(new Product(102, "Washing Machine",  9000.00 ));
        products.add(new Product(103, "Laptop",  24000.00));
        products.add(new Product(104, "Air Conditioner",  30000.00));
        products.add(new Product(105, "Refrigerator ", 10000.00));
        return products;
    }


}
