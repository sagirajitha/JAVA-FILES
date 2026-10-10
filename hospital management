import java.util.Scanner;

public class Patient {

    static Scanner sc = new Scanner(System.in);

    static void registerPatient() {
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.println("\nPatient Registered Successfully!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }

    static void bookAppointment() {
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = sc.nextLine();

        System.out.println("Appointment booked successfully!");
        System.out.println("Patient: " + name);
        System.out.println("Doctor: " + doctor);
    }

    static void cancelAppointment() {
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.println("Appointment cancelled for " + name);
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Patient");
            System.out.println("2. Book Appointment");
            System.out.println("3. Cancel Appointment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerPatient();
                    break;

                case 2:
                    bookAppointment();
                    break;

                case 3:
                    cancelAppointment();
                    break;

                case 4:
                    System.out.println("Thank you for using Hospital Management System.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}