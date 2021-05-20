package com;

public class Product {
    private int id;
    private String name;
    private double price;


    //constructor using fields
    public Product(int id, String pname, double price){
        super();
        this.id = id;
        this.name = pname;
        this.price = price;
    }
    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}
