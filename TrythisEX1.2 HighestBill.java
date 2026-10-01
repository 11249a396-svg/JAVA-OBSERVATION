import java.util.Scanner;

class Student {
    String name;
    double bill;

    Student(String name, double bill) {
        this.name = name;
        this.bill = bill;
    }
}

public class HighestBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student highest = null;

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter bill: ");
            double bill = sc.nextDouble();

            Student student = new Student(name, bill);

            if (highest == null || student.bill > highest.bill) {
                highest = student;
            }
        }

        System.out.println("\nStudent with the highest bill:");
        System.out.println("Name: " + highest.name);
        System.out.println("Bill: " + highest.bill);

        sc.close();
    }
}
