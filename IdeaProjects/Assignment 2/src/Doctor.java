public class Doctor extends Person{
private String field;
    public Doctor(int id, String name, int age) {
        super(id, name, age);
        this.field = field;

}

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
public void displayinfo(){
       System.out.println("Doctor: " +name);
       System.out.println("Field: " + field);
    }
}
