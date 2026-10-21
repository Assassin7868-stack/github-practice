//java
import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your basic salary: ");
        int Sal = input.nextInt();
        System.out.print("Enter bonus percentage: ");
        double bonusPercent = input.nextDouble();
        double bonus = Sal * bonusPercent / 100;
        double totalSalary = Sal + bonus;
        System.out.println("Your total salary is: " + totalSalary);
        System.out.println("Your bonus is: " + bonus);
        input.close();
    }
}