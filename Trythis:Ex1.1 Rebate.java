import java.util.Scanner;

public class Rebate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();

        double rebate = 0;

        if (days < 26) {
            rebate = bill * 0.10;
        }

        double finalBill = bill - rebate;

        System.out.println("Original Bill = " + bill);
        System.out.println("Rebate = " + rebate);
        System.out.println("Final Bill = " + finalBill);

        sc.close();
    }
}
