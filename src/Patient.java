class Patient extends Person {
    private String disease;


    public Patient(int id, String name, int age, String disease,String gender) {
        super(id, name, age, gender);
        this.disease = disease;

    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public void DisplayInfo() {
        System.out.println(" Id: " + getId());
        System.out.println("Name: " +getName());
        System.out.println("Age: " +getAge());
        System.out.println("Gender: "+getGender());
        System.out.println("Disease: " +getDisease());
    }

}

