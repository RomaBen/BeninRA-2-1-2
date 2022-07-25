import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        BmiService service = new BmiService();

        int weight, heightcm;
        double height, bmi;

        System.out.print("Enter your height in cm: ");
        heightcm = console.nextInt();
        height = (double) heightcm / 100;
        System.out.print("Enter your weight in kg: ");
        weight = console.nextInt();

        bmi = service.calculate(weight, height);

        String str = String.format("Your BMI is %.2f", bmi);
        System.out.println(str);
    }
}