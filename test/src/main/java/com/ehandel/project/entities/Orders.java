package com.ehandel.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "theorder")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ordernumer;
    private String productcode;
    private String productname;
    private long buyprice;
    private long msrp;

    public int getOrdernumer() {
        return this.ordernumer;
    }

    public void setOrdernumer(int ordernumer) {
        this.ordernumer = ordernumer;
    }

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
