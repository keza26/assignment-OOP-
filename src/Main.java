import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      Doctor d1 = new Doctor(1,"John",45,"Dentist","Male");
      Patient p1 = new Patient(3,"Marie",30,"Malaria","Female");

        System.out.println("------HOSPITAL MENU------");

        System.out.println("1. Check Doctor");
        System.out.println("2. Check Patients");
        System.out.println("3. Add Patient");
        System.out.println("4. Exit");

        System.out.println("Choose option: ");

        int choice = input.nextInt();

        }
    }
