public class Bill {
   private int BillId;
   private String PatientName;
   private double amount;

   public Bill(int billId, String patientName, double amount) {
      BillId = billId;
      PatientName = patientName;
      this.amount = amount;
   }

   public int getBillId() {
      return BillId;
   }

   public void setBillId(int billId) {
      BillId = billId;
   }

   public String getPatientName() {
      return PatientName;
   }

   public void setPatientName(String patientName) {
      PatientName = patientName;
   }

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }
   public void DisplayInfo(){
      System.out.println("BillId: "+getBillId());
      System.out.println("PatientName: "+getPatientName());
      System.out.println("Amount: "+getAmount());
   }
}
