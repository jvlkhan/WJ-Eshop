package com.ehandel.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Field cannot be empty.")
    private String name;


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @NotNull(message = "Field cannot be empty.")
    private String email;


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    @NotNull(message = "Field cannot be empty.")
    private String adress;

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @NotNull(message = "Field cannot be empty.")
    private String cardnumber;

    public String getCardnumber() {
        return this.cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    @NotNull(message = "Field cannot be empty.")
    private int exdatemm;

    public int getExdatemm() {
        return this.exdatemm;
    }

    public void setExdatemm(int exdatemm) {
        this.exdatemm = exdatemm;
    }

    @NotNull(message = "Field cannot be empty.")
    private int exdateyy;

    public int getExdateyy() {
        return this.exdateyy;
    }

    public void setExdateyy(int exdateyy) {
        this.exdateyy = exdateyy;
    }

    @NotNull(message = "Field cannot be empty.")
    private int cvv;

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String toString() {
        return "Customer(Name: " + this.name + "\nEmail: " + this.email + "\nAdress: " + this.adress + ")";
    }
}
