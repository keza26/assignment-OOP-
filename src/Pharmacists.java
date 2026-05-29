public class Pharmacists {
    private int Id;
    private String name;
    private double price;
    private String medicine;

    public Pharmacists(int id, String name, double price, String medicine) {
        Id = id;
        this.name = name;
        this.price = price;
        this.medicine = medicine;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    public void DisplayInfo(){
        System.out.println("Id: "+getId());
        System.out.println("Name: "+getName());
        System.out.println("price: "+getPrice());
        System.out.println("Medicine: "+getMedicine());
    }
}
