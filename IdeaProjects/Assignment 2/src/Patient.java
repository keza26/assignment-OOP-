class Patient extends Person {
    private String disease;


    public Patient(int id, String name, int age) {
        super(id, name, age);
        this.disease = disease;


    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public void displayinfo() {
        System.out.println("Patient id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Disease: " + disease);
    }
}

