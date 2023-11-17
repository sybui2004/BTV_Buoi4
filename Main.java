package bookstore;

import java.util.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void pressEnterToContinue() {
        System.out.println("Nhan Enter de tiep tuc");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static void clearScreen() {
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }
    public static int cnt = 0;
    //public static Admin admin = new Admin();
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Admin admin = new Admin();
        Customer customer = new Customer();
        System.out.println("Chao mung ban den voi The World of Book!!!");
        //clearScreen();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Nhap tai khoan cua ban:");
            String account = sc.nextLine();
            //System.out.println(account);
            while (!account.equals(admin.getAccount()) && !account.equals(customer.getAccount())) {
                System.out.println("Tai Khoan cua ban khong dung!!!");
                System.out.println("Moi ban nhap lai!!!");
                account = sc.nextLine();
            }
            if (account.equals(customer.getAccount())) {
                //clearScreen();
                customer.programCustomer(products);
            } else if (account.equals(admin.getAccount())) {
                String password;
                System.out.println("Nhap mat khau cua ban:");
                password = sc.nextLine();
                while (!password.equals(admin.getPassword())) {
                    System.out.println("Mat khau cua ban khong dung!!!");
                    System.out.println("Moi ban nhap lai!!!");
                    password = sc.nextLine();
                }
                clearScreen();
                admin.programAdmin(products);
            }
        }
    }
}


