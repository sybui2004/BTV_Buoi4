
package bookstore;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveProduct extends Admin{
    public void removeBook(ArrayList<Product> products, int id) {
        Scanner sc = new Scanner(System.in);
        while(id < 1 || id > products.size()) {
            System.out.println("ID khong hop le. Vui long nhap lai ID:");
            id = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Da xoa san pham co");
        System.out.println("ID: " + id);
        products.remove(--id);
        pressEnterToContinue();
    }

    
}
