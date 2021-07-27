package com.stereo.realveggies.realveggies.model;

import javax.persistence.*;

@Entity
@Table(name = "veggies")
public class Veggie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column(name = "photo")
    private String photo;

    public Veggie() {
    }

    public Veggie(Long id, String name, Double price, Double quentity, boolean isDeleted, String photo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quentity;
        this.isDeleted = isDeleted;
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
