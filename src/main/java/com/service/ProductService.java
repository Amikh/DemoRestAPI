package com.service;

import com.model.Product;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Log
@Service
public class ProductService  {

    public List<Product> findAll(){
        List<Product> list = new ArrayList<>();
        list.add(new Product(101,"Mob",9000.0));
        return list;
    }




   public String isSla(){
       String result=null;
       int min = 0;
       int max = 10;
       int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
       log.info("rundom number : "+random_int);
       return Integer.toString(random_int);
   }


}
