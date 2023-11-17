package bookstore;
public class Pencil extends Product{
    private String color, material, hardness;
    public Pencil(String name, String trademark, String color, String material, String hardness, int price) {
        this.name = name;
        this.trademark = trademark;
        this.color = color;
        this.material = material;
        this.hardness = hardness;
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }
    public String getHardness() {
        return hardness;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setHardness(String hardness){
        this.hardness = hardness;
    }
    public boolean compare(String temp) {
        return compare1(temp)||cmp(color, temp)||cmp(material, temp)||cmp(hardness, temp);
    }
    public void showList() {
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia ban: " + price);
        System.out.println("Thuong hieu: " + trademark);
        System.out.println("Mau sac: " + color);
        System.out.println("Chat lieu: " + material);
        System.out.println("Do cung: "+ hardness);
    }
    public void showTable() {
        System.out.println(String.format("|%-13s|%-15d|%-12s|- Mau sac: %-12s|", name, price, trademark, color));
        System.out.println(String.format("|   |             |               |            |- Chat lieu: %-10s|", material));
        System.out.println(String.format("|   |             |               |            |- Do cung: %-12s|", hardness));
    }
}
