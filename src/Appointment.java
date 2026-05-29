 class Appointment {
    private int appointmentId;
     private String patient;
     private String doctor;
     private String date;


     public Appointment(int appointmentId, String patient, String doctor, String date) {
         this.appointmentId = appointmentId;
         this.patient = patient;
         this.doctor = doctor;
         this.date = date;


     }
         public int getAppointmentId() {
             return appointmentId;
         }

         public String getPatient() {
             return patient;
         }

         public String getDoctor() {
             return doctor;
         }

         public String getDate() {
             return date;

         }

     public void setAppointmentId(int appointmentId) {
         this.appointmentId = appointmentId;
     }

     public void setPatient(String patient) {
         this.patient = patient;
     }

     public void setDoctor(String doctor) {
         this.doctor = doctor;
     }

     public void setDate(String date) {
         this.date = date;
     }


     public void DisplayInfo(){
         System.out.println("AppointmentId: " +getAppointmentId());
         System.out.println("Patient: " +getPatient());
         System.out.println("Doctor: " +getDoctor());
         System.out.println("Date: "+getDate());
     }

 }


