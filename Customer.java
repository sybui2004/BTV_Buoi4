package bookstore;

import java.io.IOException;
import java.util.*;

//class Sortbyroll implements Comparator<Product> {
//
//    @Override
//    public int compare(Book a, Book b) {
//        String[] tmp1 = a.getDateOfPublish().split("\\/");
//        String[] tmp2 = b.getDateOfPublish().split("\\/");
//        if (Integer.valueOf(tmp1[2]).equals(Integer.valueOf(tmp2[2]))) {
//            if (Integer.valueOf(tmp1[1]).equals(Integer.valueOf(tmp2[1])))
//                return Integer.valueOf(tmp1[0]) - Integer.valueOf(tmp2[0]);
//            return Integer.valueOf(tmp1[1]) - Integer.valueOf(tmp2[1]);
//        }
//        return Integer.valueOf(tmp1[2]) - Integer.valueOf(tmp2[2]);
//    }
//}

public class Customer {
    private static final String account = "khach";

    public String getAccount() {
        return account;
    }

    public static void pressEnterToContinue() {
        System.out.println("Press Enter to continue");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public void customerOption() {
        System.out.println("Moi ban chon chuc nang");
        System.out.println("1. Tim kiem sach");
        System.out.println("2. Xem danh sach cac sach");
        System.out.println("3. Exit");
        System.out.println("4. Quay lai");
    }

    public void searchBook(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bat ky thong tin ban muon tim:");
        ArrayList<Product> products1 = new ArrayList<>();
        String cur = sc.nextLine();
        int cnt = 0;
        System.out.println("Ket qua:");
        for (Product item : products) {
            if(item instanceof NoteBook) {
                if(((NoteBook) item).compare(cur)) {
                    products1.add(item);
                    cnt = 1;
                }
            }
            else if(item instanceof Pen) {
                if(((Pen) item).compare(cur)){
                    products1.add(item);
                    cnt = 1;
                }
            }
            else if(item instanceof Pencil) {
                if(((Pencil) item).compare(cur)){
                    products1.add(item);
                    cnt = 1;
                }
            }
            else if(item instanceof Book) {
                if(((Book) item).compare(cur)){
                    products1.add(item);
                    cnt = 1;
                }
            }
        }
        if (cnt == 0) {
            System.out.println("Khong tim thay san pham nao nhu ban muon!");
        } else {
            System.out.println("Ban muon hien thi danh sach san pham tim duoc theo: ");
            System.out.println("1. Danh sach");
            System.out.println("2. Bang");
            int choosen = sc.nextInt();
            while(choosen < 1 || choosen > 2){
                System.out.println("Lua chon khong hop le! Vui long nhap lai: ");
                choosen = sc.nextInt();
            }
            Product product = new Product();
            if(choosen == 1) product.showList(products1);
            else product.showTable(products1);
        }
        pressEnterToContinue();
    }

    public void listBook(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        if (products.isEmpty()) System.out.println("Cua hang khong co san pham nao ca!");
        else {
            System.out.println("Ban muon hien thi tat ca san pham theo: ");
            System.out.println("1. Danh sach");
            System.out.println("2. Bang");
            int choosen = sc.nextInt();
            while(choosen < 1 || choosen > 2){
                System.out.println("Lua chon khong hop le! Vui long nhap lai: ");
                choosen = sc.nextInt();
            }
            Product product = new Product();
            System.out.println("Danh sach san pham tim kiem duoc");
            if(choosen == 1) product.showList(products);
            else product.showTable(products);
//            System.out.println("Ban co muon sap xep theo ngay xuat ban khong? (y/n)");
//            Scanner sc = new Scanner(System.in);
//            String choose = sc.nextLine();
//            if ("y".equals(choose) || "Y".equals(choose)) {
//                Collections.sort(books, new Sortbyroll());
//                clearScreen();
//                System.out.println("                     Danh sach thu vien\n");
//                System.out.println("-----------------------------------------------------------------");
//                System.out.println("|ID |    Chu de   |  Ten tac gia  |  The loai  |  Ngay xuat ban |");
//                System.out.println("-----------------------------------------------------------------");
//                for (Book item : books) {
//                    System.out.println(item);
//                    System.out.println("-----------------------------------------------------------------");
//                }
//            }
        }
    }

    public void programCustomer(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        int check = 0;
        do {
            System.out.println("Ban dang dang nhap voi tu cach Customer.");
            customer.customerOption();
            int choose = sc.nextInt();
            while (choose < 1 || choose > 4) {
                System.out.println("Khong co chuc nang nay! Moi ban nhap lai:");
                choose = sc.nextInt();
                //System.out.println(choose);
            }
            switch (choose) {
                case 1 -> {
                    if (products.isEmpty()) {
                        System.out.println("Cua hang khong co san pham nao ca!!!");
                        pressEnterToContinue();
                        break;
                    }
                    String choose2 = "y";
                    do {
                        customer.searchBook(products);
                        System.out.println("Ban co muon tiep tuc tim san pham khong? (y/n)");
                        choose2 = sc.nextLine();
                    } while (choose2.equals("y") || choose2.equals("Y"));
                }
                case 2 -> {
                    if (products.isEmpty()) {
                        System.out.println("Cua hang khong co san pham nao ca!!!");
                        pressEnterToContinue();
                        break;
                    }
                    customer.listBook(products);
                    pressEnterToContinue();
                }
                case 3 -> {
                    System.out.println("See you again!");
                    System.exit(0);
                }
                default -> {
                    check = 1;
                }
            }
            //clearScreen();
            if (check == 1) break;
        } while (true);
    }
}
