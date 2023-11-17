package bookstore;

import java.lang.*;
import java.util.*;

public class Book extends Product{
    private String type, author, dateOfPublish, language, publisher;
    public Book(String name, String type, String author, String dateOfPublish, String language, String publisher, String trademark, int price) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.dateOfPublish = dateOfPublish;
        this.language = language;
        this.publisher = publisher;
        this.trademark = trademark;
        this.price = price;
    }

    public String getType() {
        return type;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getDateOfPublish() {
        return dateOfPublish;
    }

    public String getLanguage() {
        return language;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setDateOfPublish(String dateOfPublish) {
        String[] tmp = dateOfPublish.split("\\/");
        if (tmp[0].length() < 2) tmp[0] = '0' + tmp[0];
        if (tmp[1].length() < 2) tmp[1] = '0' + tmp[1];
        if (tmp[2].length() < 4) tmp[2] = '0' + tmp[2];
        this.dateOfPublish = tmp[0] + "/" + tmp[1] + "/" + tmp[2];
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public boolean compare(String temp) {
        return  compare1(temp)|| cmp(type, temp) || cmp(author, temp) ||
                cmp(dateOfPublish, temp)||cmp(language, temp)||cmp(publisher, temp);
    }
    public void showList() {
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia ban: " + price);
        System.out.println("Thuong hieu: " + trademark);
        System.out.println("The loai: " + type);
        System.out.println("Tac gia: " + author);
        System.out.println("Nha xuat ban: "+ publisher);
        System.out.println("Nam xuat ban: "+ dateOfPublish);
        System.out.println("Ngon ngu: "+ language);
    }
    public void showTable() {
        System.out.println(String.format("|%-13s|%-15d|%-12s|- Mau sac: %-12s|", name, price, trademark, type));
        System.out.println(String.format("|   |             |               |            |- Tac gia: %-12s|", author));
        System.out.println(String.format("|   |             |               |            |- Nha xuat ban: %-7s|", publisher));
        System.out.println(String.format("|   |             |               |            |- Nam xuat ban: %-7s|", dateOfPublish));
        System.out.println(String.format("|   |             |               |            |- Ngon ngu: %-11s|", language));
    }
}

