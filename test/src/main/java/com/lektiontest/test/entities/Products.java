package com.lektiontest.test.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productcode;
    private String productname;
    private String productline;
    private String productscale;
    private String productvendor;
    private String productdescription;
    private int quantityinstock;
    private long buyprice;
    private long msrp;

	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductline() {
		return this.productline;
	}

	public void setProductline(String productline) {
		this.productline = productline;
	}

	public String getProductscale() {
		return this.productscale;
	}

	public void setProductscale(String productscale) {
		this.productscale = productscale;
	}

	public String getProductvendor() {
		return this.productvendor;
	}

	public void setProductvendor(String productvendor) {
		this.productvendor = productvendor;
	}

	public String getProductdescription() {
		return this.productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public int getQuantityinstock() {
		return this.quantityinstock;
	}

	public void setQuantityinstock(int quantityinstock) {
		this.quantityinstock = quantityinstock;
	}

	public long getBuyprice() {
		return this.buyprice;
	}

	public void setBuyprice(long buyprice) {
		this.buyprice = buyprice;
	}

	public long getMsrp() {
		return this.msrp;
	}

	public void setMsrp(long msrp) {
		this.msrp = msrp;
	}



}
