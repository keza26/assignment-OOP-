public class Doctor extends Person{
private String field;
    public Doctor(int id, String name, int age, String field,String gender) {
        super(id, name, age,gender);
        this.field = field;

}

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
public void DisplayInfo(){
        System.out.println(" Id: " + getId());
        System.out.println("Name: " +getName());
        System.out.println("Age: " +getAge());
        System.out.println("Gender: "+getGender());
        System.out.println("Field: " + getField());
    }
}
