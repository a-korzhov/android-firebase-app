package com.example.cloudapp;

public class ListData {
    String name;
    String price;
    String count;
    public ListData(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public ListData(String name, String price, String count){
        this.name = name;
        this.price = price;
        this.count = count;

    }

}

