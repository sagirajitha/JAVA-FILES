import java.util.Scanner;

public class LibraryManagement {

    static Scanner sc = new Scanner(System.in);

    static void addBook() {
        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.println("Book added successfully!");
        System.out.println("Book: " + book);
        System.out.println("Author: " + author);
    }

    static void issueBook() {
        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Member Name: ");
        String member = sc.nextLine();

        System.out.println("Book issued successfully!");
        System.out.println("Book: " + book);
        System.out.println("Member: " + member);
    }

    static void returnBook() {
        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.println("Book returned successfully!");
        System.out.println("Book: " + book);
    }

    static void calculateFine() {
        System.out.print("Enter number of overdue days: ");
        int days = sc.nextInt();
        sc.nextLine();

        int fine = days * 5;

        System.out.println("Overdue Days: " + days);
        System.out.println("Fine Amount: Rs." + fine);
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Calculate Fine");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;

                case 2:
                    issueBook();
                    break;

                case 3:
                    returnBook();
                    break;

                case 4:
                    calculateFine();
                    break;

                case 5:
                    System.out.println("Thank you for using Library Management System!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}