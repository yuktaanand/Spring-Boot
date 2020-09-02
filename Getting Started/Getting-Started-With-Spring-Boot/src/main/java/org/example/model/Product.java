package org.example.model;

public class Product {
    public int Id;
    public String Name;

    // default constructor
    public Product() {
    }
    // constructor for convenience
    public Product(int id, String name) {
        Id = id;
        Name = name;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) { Id = id; }

    public String getName() { return Name; }

    public void setName(String name) {
        Name = name;
    }
}
