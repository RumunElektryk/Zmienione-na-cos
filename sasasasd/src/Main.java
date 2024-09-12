import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wzrost w metrach:");
        double height = scan.nextDouble();
        System.out.println("Podaj wage w kg:");
        double weight = scan.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5)
            System.out.println("Niedowaga");
        else if (bmi < 25) {
            System.out.println("Waga normalna");

        } else if (bmi < 30) {
            System.out.println("Waga normalna");

        } else if (bmi > 31) {
            System.out.println("Nadwaga");

        }
    }
}
//Pozdrawiam pana Kacpra Ksykiewicza (:


