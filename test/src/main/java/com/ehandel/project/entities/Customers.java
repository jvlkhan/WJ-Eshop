package com.ehandel.project.entities;

import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @NotNull(message = "field cannot be empty.")
    private Long customernumber;
    @NotNull(message = "field cannot be empty.")
    private String customername;
    private String contactlastname;
    private String contactfirstname;
    @NotNull(message = "field cannot be empty.")
    private String phone;
    @NotNull(message = "field cannot be empty.")
    private String addressline1;
    private String addressline2;
    private String city;
    private String state;
    private String postalcode;
    private String country;
    private float creditlimit;

    public Long getCustomernumber() {
        return this.customernumber;
    }

    public void setCustomernumber(Long customernumber) {
        this.customernumber = customernumber;
    }

    
    public String getCustomername() {
        return this.customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getContactlastname() {
        return this.contactlastname;
    }

    public void setContactlastname(String contactlastname) {
        this.contactlastname = contactlastname;
    }

    public String getContactfirstname() {
        return this.contactfirstname;
    }

    public void setContactfirstname(String contactfirstname) {
        this.contactfirstname = contactfirstname;
    }


    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    public String getAddressline1() {
        return this.addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return this.addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalcode() {
        return this.postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getCreditlimit() {
        return this.creditlimit;
    }

    public void setCreditlimit(float creditlimit) {
        this.creditlimit = creditlimit;
    }

    public String toString() {
        return "Customer(Name: " + this.contactfirstname + "\nTelefon: " + this.phone + "\nAdress: " + this.addressline1 + ")";
    }
}

