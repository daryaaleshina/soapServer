package soapServer;

import java.io.Serializable;

public class Book implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int    id;
    private String title;
    private String description;
    private int    price;
    private int    pages;

    public Book() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    
    
}
