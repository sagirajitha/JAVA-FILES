import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Attendance Percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter Marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Attendance : " + attendance + "%");
        System.out.println("Total Marks: " + total);
        System.out.println("Average    : " + average);

        if (average >= 90)
            System.out.println("Grade      : A+");
        else if (average >= 80)
            System.out.println("Grade      : A");
        else if (average >= 70)
            System.out.println("Grade      : B");
        else if (average >= 60)
            System.out.println("Grade      : C");
        else if (average >= 50)
            System.out.println("Grade      : D");
        else
            System.out.println("Grade      : F");

        if (attendance >= 75)
            System.out.println("Attendance Status: Eligible");
        else
            System.out.println("Attendance Status: Shortage");

        sc.close();
    }
}