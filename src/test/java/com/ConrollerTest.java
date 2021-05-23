package com;

import com.controller.ProductController;
import com.service.ProductService;
import org.junit.Test;


public class ConrollerTest {

    private ProductService productService;

    @Test
    public  void isTest(){
        ProductController pc = new ProductController(productService);
        pc.getProduct();
        

    }
}
