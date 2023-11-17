package bookstore;
public class NoteBook extends Product{
    private String type, color, material, size;
    private int numberOfPage;
    public NoteBook(String name, String trademark, int numberOfPage, String type, String coverColor, String material, String size, int price) {
        this.name = name;
        this.trademark = trademark;
        this.numberOfPage = numberOfPage;
        this.type = type;
        this.color = coverColor;
        this.material = material;
        this.size = size;
        this.price = price;
    }
    public int getNumberOfPage() {
        return numberOfPage;
    }
    public String getType() {
        return type;
    }
    public String getCoverColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }
    public String getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setSize(String size){
        this.size = size;
    }
    public boolean compare(String temp) {
        return compare1(temp) || cmp(type, temp) || cmp(color, temp) || cmp(material, temp) || cmp(size, temp) || temp.equals(String.valueOf(numberOfPage));
    }
    public void showList(){
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia ban: " + price);
        System.out.println("Thuong hieu: " + trademark);
        System.out.println("So trang: " + numberOfPage);
        System.out.println("Loai vo: "+ type);
        System.out.println("Mau sac bia: " + color);
        System.out.println("Chat lieu giay: " + material);
        System.out.println("Kich thuoc: " + size);
    }
    public void showTable() {
        System.out.println(String.format("|%-13s|%-15d|%-12s|- Loai vo: %-12s|", name, price, trademark, type));
        System.out.println(String.format("|   |             |               |            |- Mau sac: %-12s|", color));
        System.out.println(String.format("|   |             |               |            |- Chat lieu: %-10s|", material));
        System.out.println(String.format("|   |             |               |            |- Kich thuoc: %-9s|", size));
        System.out.println(String.format("|   |             |               |            |- So trang: %-11d|", numberOfPage));
    }
}
