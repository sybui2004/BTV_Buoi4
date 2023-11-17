package bookstore;

import java.util.ArrayList;

public class Product {
    protected String name, trademark;
    protected int price;
    public String getName() {
        return name;
    }
    public String getTrademark() {
        return trademark;
    }
    public int getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean cmp(String current, String temp) {
        return current.toLowerCase().contains(temp.toLowerCase());
    }
    public boolean compare1(String temp) {
        return cmp(name, temp)||cmp(trademark, temp)||temp.equals(String.valueOf(price));
    }
    public void showList(ArrayList<Product> products)
    {
        int dem = 0;
        System.out.println("------");
        for(Product item : products)
        {
            dem++;
            System.out.println("ID: "+dem);
            if(item instanceof NoteBook) {
                ((NoteBook) item).showList();
            }
            else if(item instanceof Pen) {
                ((Pen) item).showList();
            }
            else if(item instanceof Pencil) {
                ((Pencil) item).showList();
            }
            else if(item instanceof Book) {
                ((Book) item).showList();
            }
            System.out.println("------");
        }
    }
    public void showTable(ArrayList<Product> products) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|ID |Ten san pham |    Gia ban    |Thuong hieu |    Thong tin them     |");
        System.out.println("------------------------------------------------------------------------");
        int dem = 0;
        for(Product item : products)
        {
            dem++;
            System.out.print(String.format("|%-3s", String.valueOf(dem)));
            if(item instanceof NoteBook) {
                ((NoteBook) item).showTable();
            }
            else if(item instanceof Pen) {
                ((Pen) item).showTable();
            }
            else if(item instanceof Pencil) {
                ((Pencil) item).showTable();
            }
            else if(item instanceof Book) {
                ((Book) item).showTable();
            }
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
