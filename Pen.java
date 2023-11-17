package bookstore;
public class Pen extends Product{
    private String color, material, type, fineness;
    public Pen(String name, String trademark, String color, String material, String type, String fineness, int price) {
        this.name = name;
        this.trademark = trademark;
        this.color = color;
        this.material = material;
        this.type = type;
        this.fineness = fineness;
        this.price = price;
    }
    
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
    public String getMaterial() {
        return material;
    }
    public String getFineness() {
        return fineness;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setFineness(String fineness){
        this.fineness = fineness;
    }
    public boolean compare(String temp) {
        return compare1(temp)|| cmp(color, temp)||
                cmp(material, temp)||cmp(type, temp)||cmp(fineness, temp);
    }
    public void showList() {
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia ban: " + price);
        System.out.println("Thuong hieu: " + trademark);
        System.out.println("Mau sac: " + color);
        System.out.println("Chat lieu: "+ material);
        System.out.println("Loai muc: " + type);
        System.out.println("Do min: "+ fineness);
    }
    public void showTable() {
        System.out.println(String.format("|%-13s|%-15d|%-12s|- Mau sac: %-12s|", name, price, trademark, color));
        System.out.println(String.format("|   |             |               |            |- Chat lieu: %-10s|", material));
        System.out.println(String.format("|   |             |               |            |- Loai muc: %-11s|", type));
        System.out.println(String.format("|   |             |               |            |- Do min: %-13s|", fineness));
    }
}
