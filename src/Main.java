import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        BmiService service = new BmiService();

        int weight, heightCM;
        double height, bmi;

        System.out.print("Enter your height in cm: ");
        heightCM = console.nextInt();
        if (heightCM < 40){
            while (heightCM < 40) {
                System.out.print("Your height can not be lower than a newborn kid, write your height again: ");
                heightCM = console.nextInt();
            }
        }
        height = (double) heightCM / 100;

        System.out.print("Enter your weight in kg: ");
        weight = console.nextInt();
        if (weight < 2) {
            while (weight < 2) {
                System.out.print("Your weight can not be lower than a newborn kid, write your weight again: ");
                weight = console.nextInt();
            }
        }

        bmi = service.calculate(weight, height);

        String str = String.format("Your BMI is %.2f", bmi);
        System.out.println(str);
    }
}