package com.ehandel.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Field cannot be empty.")
    private String name;

    @NotNull(message = "Field cannot be empty.")
    private String email;
    
    @NotNull(message = "Field cannot be empty.")
    private String adress;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String toString() {
        return "Customer(Name: " + this.name + "\nEmail: " + this.email + "\nAdress: " + this.adress + ")";
    }
}
