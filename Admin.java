package bookstore;
import java.util.*;
public class Admin extends Customer{
    private static final String account = "admin", password = "admin";
    public static int choose3 = 0;
    @Override
    public String getAccount() {
        return account;
    }
    public String getPassword() {
        return password;
    }
    public void adminOption() {
        System.out.println("1. Them san pham moi");
        System.out.println("2. Xoa san pham");
        System.out.println("3. Sua thong tin san pham");
        System.out.println("4. Cac chuc nang cua khach");
        System.out.println("5. Exit");
        System.out.println("6. Quay lai dang nhap");
    }
    public void menuProduct() {
        System.out.println("1. Vo ghi");
        System.out.println("2. But chi");
        System.out.println("3. But muc");
        System.out.println("4. Sach");
    }

    public void testCustomerMode(ArrayList<Product> products) {
        //pressEnterToContinue();
        Scanner sc = new Scanner(System.in);
        Customer liac = new Customer();
        liac.customerOption();
        int choose = sc.nextInt();
        switch (choose) {
            case 1 -> {
                if (products.isEmpty()) {
                    System.out.println("Cua hang khong co san pham nao ca!!!");
                    pressEnterToContinue();
                    break;
                }
                liac.searchBook(products);
            }
            case 2 -> {
                if (products.isEmpty()) {
                    System.out.println("Cua hang khong co san pham nao ca!!!");
                    pressEnterToContinue();
                    break;
                }
                liac.listBook(products);
            }
            case 3 -> System.exit(0);
            case 4 -> choose3 = 1;
        }
    }

    public void programAdmin(ArrayList<Product> products) {
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);
        int choose = 0, check = 0;
        do {
            System.out.println("Ban dang dang nhap voi tu cach Admin.");
            admin.adminOption();
            choose = sc.nextInt();
            while (choose < 1 || choose > 6) {
                System.out.println("Khong co chuc nang nay! Moi ban nhap lai:");
                choose = sc.nextInt();
                sc.nextLine();
                //System.out.println(choose);
            }
            Product product = new Product();
            switch (choose) {
                case 1 -> {
                    //clearScreen();
                    InsertProduct iP = new InsertProduct();
                    iP.insertProduct(products);
                    Main.cnt++;
                    //clearScreen();
                }
                case 2 -> {
                    sc.nextLine();
                    //clearScreen();
                    if (products.isEmpty()) {
                        System.out.println("Cua hang khong co san pham nao ca!!!");
                        pressEnterToContinue();
                        //clearScreen();
                        break;
                    }
                    System.out.println("                     Cua hang do dung hoc tap\n");
                    product.showTable(products);
                    if (!products.isEmpty()) {
                        System.out.println("Tu danh sach chon vao ID cua san pham ma ban muon xoa: ");
                        int id = sc.nextInt();
                        RemoveProduct rP = new RemoveProduct();
                        rP.removeBook(products, id);
                        //clearScreen();
                    }
                }
                case 3 -> {
                    sc.nextLine();
                    //clearScreen();
                    if (products.isEmpty()) {
                        System.out.println("Cua hang khong co san pham nao ca!!!");
                        pressEnterToContinue();
                        //clearScreen();
                        break;
                    }
                    System.out.println("                     Cua hang do dung hoc tap\n");
                    product.showTable(products);
                    System.out.println("Nhap vao ID cua san pham ma ban muon sua:");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    ChangeInfProduct cIP = new ChangeInfProduct();
                    cIP.changeInfProduct(products, id1);
                    //clearScreen();
                }
                case 4 -> {
                    sc.nextLine();
                    String choose2 = "y";
                    do {
                        //clearScreen();
                        admin.testCustomerMode(products);
                        if(choose3 == 1) break;
                        System.out.println("Ban co muon tiep tuc test khong? (y/n)");
                        choose2 = sc.nextLine();
                    } while ("y".equals(choose2) || "Y".equals(choose2));
                }
                case 5 -> {
                    System.out.println("See you again!!!");
                    System.exit(0);
                }
                default -> {
                    check = 1;
                    break;
                }
            }
            if (check == 1) break;
        } while (choose != 7);
    }
}
