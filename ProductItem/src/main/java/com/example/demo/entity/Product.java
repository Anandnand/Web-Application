package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private String mfd; 
    private String  efd;
    private String uses;

    public Product() {
    }

    public Product(int id,String name, String mfd, String efd, String uses) {
    	this.id=id;
        this.name = name;
        this.mfd = mfd;
        this.efd = efd;
        this.uses = uses;
    }

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

    public String getMfd() {
        return mfd;
    }

    public void setMfd(String mfd) {
        this.mfd = mfd;
    }

    public String getEfd() {
        return efd;
    }

    public void setEfd(String efd) {
        this.efd = efd;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", mfd=" + mfd + ", efd=" + efd + ", uses=" + uses + "]";
    }
}

