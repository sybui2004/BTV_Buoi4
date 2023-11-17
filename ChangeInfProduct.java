
package bookstore;

import static bookstore.Customer.pressEnterToContinue;
import java.util.ArrayList;
import java.util.Scanner;

public class ChangeInfProduct extends Admin{
    public void changeInfProduct(ArrayList<Product> products, int id) {
        Scanner sc = new Scanner(System.in);
        while(id < 1 || id > products.size()) {
            System.out.println("ID khong hop le. Vui long nhap lai ID:");
            id = sc.nextInt();
        }
        id--;
        String name, trademark;
        int price;
        sc.nextLine();
        Product temp = products.get(id);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        temp.setName(name);
        System.out.println("Nhap gia: ");
        price = sc.nextInt();
        sc.nextLine();
        temp.setPrice(price);
        System.out.println("Nhap thuong hieu: ");
        trademark = sc.nextLine();
        temp.setTrademark(trademark);
        if(temp instanceof NoteBook) {
            String type, color, material, size;
            int numberOfPage;
            System.out.println("Nhap so trang: ");
            numberOfPage = sc.nextInt();
            sc.nextLine();
            ((NoteBook) temp).setNumberOfPage(numberOfPage);
            System.out.println("Nhap loai vo: ");
            type = sc.nextLine();
            ((NoteBook) temp).setType(type);
            System.out.println("Nhap mau sac bia: ");
            color = sc.nextLine();
            ((NoteBook) temp).setColor(color);
            System.out.println("Nhap chat lieu vo: ");
            material = sc.nextLine();
            ((NoteBook) temp).setMaterial(material);
            System.out.println("Nhap kich thuoc vo: ");
            size = sc.nextLine();
            ((NoteBook) temp).setSize(size);
        }
        else if(temp instanceof Pencil) {
            String color, material, hardness;
            System.out.println("Nhap mau sac but: ");
            color = sc.nextLine();
            ((Pencil) temp).setColor(color);
            System.out.println("Nhap chat lieu but: ");
            material = sc.nextLine();
            ((Pencil) temp).setMaterial(material);
            System.out.println("Nhap do cung but: ");
            hardness = sc.nextLine();
            ((Pencil) temp).setHardness(hardness);
        }
        else if(temp instanceof Pen) {
            String color, material, type, fineness;
            System.out.println("Nhap mau sac but: ");
            color = sc.nextLine();
            ((Pen) temp).setColor(color);
            System.out.println("Nhap chat lieu but: ");
            material = sc.nextLine();
            ((Pen) temp).setMaterial(material);
            System.out.println("Nhap loai muc cua but: ");
            type = sc.nextLine();
            ((Pen) temp).setType(type);
            System.out.println("Nhap do min but: ");
            fineness = sc.nextLine();
            ((Pen) temp).setFineness(fineness);
        }else {
            String type, author, dateOfPublish, language, publisher;
            System.out.println("Nhap loai sach: ");
            type = sc.nextLine();
            ((Book) temp).setType(type);
            System.out.println("Nhap ten tac gia: ");
            author = sc.nextLine();
            ((Book) temp).setAuthor(author);
            System.out.println("Nhap ngay xuat ban:");
            dateOfPublish = sc.nextLine();
            String[] tmp = dateOfPublish.split("\\/");
            while(Integer.valueOf(tmp[0]) > 31 || Integer.valueOf(tmp[1]) > 12) {
                System.out.println("Ngay xuat ban khong dung dinh dang! Vui long nhap lai: ");
                dateOfPublish = sc.nextLine();
                String[] cur = dateOfPublish.split("\\/");
                tmp[0] = cur[0];
                tmp[1] = cur[1];
            }
            ((Book) temp).setDateOfPublish(dateOfPublish);
            System.out.println("Nhap ngon ngu: ");
            language = sc.nextLine();
            ((Book) temp).setLanguage(language);
            System.out.println("Nhap nha xuat ban: ");
            publisher = sc.nextLine();
            ((Book) temp).setPublisher(publisher);
        }
        System.out.println("Ban da sua xong.");
        pressEnterToContinue();
    }
}

