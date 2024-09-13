package kz.example.homework1.Homework1.Task2;

public class Product {
    private Integer image;
    private String title;
    private String Desc;
    private Integer Price;

    public Product(Integer image, String desc, String title, Integer price) {
        this.image = image;
        Desc = desc;
        this.title = title;
        Price = price;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }
}
