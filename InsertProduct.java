
package bookstore;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertProduct extends Admin {
    public void insertProduct(ArrayList<Product> products) {
        menuProduct();
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon san pham ban muon them: ");
        int choose = sc.nextInt();
        while(choose < 1||choose > 4) {
            System.out.println("Khong co mau san pham nay! Moi ban nhap lai: ");
            choose = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        //sc.nextLine();
        System.out.println("Nhap gia: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thuong hieu: ");
        String trademark = sc.nextLine();
        switch (choose) {
            case 1 -> {
                String type, color, material, size;
                int numberOfPage;
                System.out.println("Nhap so trang: ");
                numberOfPage = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap loai vo: ");
                type = sc.nextLine();
                System.out.println("Nhap mau sac bia: ");
                color = sc.nextLine();
                System.out.println("Nhap chat lieu vo: ");
                material = sc.nextLine();
                System.out.println("Nhap kich thuoc vo: ");
                size = sc.nextLine();
                NoteBook notebook= new NoteBook(name, trademark, numberOfPage, type, color, material, size, price);
                //System.out.println(Book.getCnt());
                products.add(notebook);
            }
            case 2 -> {
                String color, material, hardness;
                System.out.println("Nhap mau sac but: ");
                color = sc.nextLine();
                System.out.println("Nhap chat lieu but: ");
                material = sc.nextLine();
                System.out.println("Nhap do cung but: ");
                hardness = sc.nextLine();
                Pencil pencil = new Pencil(name, trademark, color, material, hardness, price);
                products.add(pencil);
            }
            case 3 -> {
                String color, material, type, fineness;
                System.out.println("Nhap mau sac but: ");
                color = sc.nextLine();
                System.out.println("Nhap chat lieu but: ");
                material = sc.nextLine();
                System.out.println("Nhap loai muc cua but: ");
                type = sc.nextLine();
                System.out.println("Nhap do min but: ");
                fineness = sc.nextLine();
                Pen pen = new Pen(name, trademark, color, material, type, fineness, price);
                products.add(pen);
            }
            case 4 -> {
                String type, author, dateOfPublish, language, publisher;
                System.out.println("Nhap loai sach: ");
                type = sc.nextLine();
                System.out.println("Nhap ten tac gia: ");
                author = sc.nextLine();
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
                System.out.println("Nhap ngon ngu: ");
                language = sc.nextLine();
                System.out.println("Nhap nha xuat ban: ");
                publisher = sc.nextLine();
                Book book = new Book(name, type, author, dateOfPublish, language, publisher, trademark, price);
                book.setDateOfPublish(dateOfPublish);
                products.add(book);
            }
        }
        System.out.println("Ban da them san pham vao thu vien.");
        pressEnterToContinue();
    }
}
