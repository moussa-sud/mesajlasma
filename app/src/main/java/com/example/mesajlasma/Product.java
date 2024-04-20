package com.example.mesajlasma;


public class Product {
    private String name;
    private String price;
    private int image;
    private boolean isFavourite;

    // Constructor without parameters
    public Product() {
    }

    // Constructor with parameters
    public Product(String name, String price, int image, boolean isFavourite) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.isFavourite = isFavourite;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return price;
    }

    public void setMessage(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    // Other methods as needed for additional behavior
}
