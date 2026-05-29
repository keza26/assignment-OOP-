public class Receptionist {
    private int id;
    private String name;

    public Receptionist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void DisplayInfo(){
        System.out.println("Id: "+getId());
        System.out.println("Name: "+getName());
    }
}
