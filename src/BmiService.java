public class BmiService {
    public double calculate(int weight, double height){
        int degree = 2;
        double heightPowed = Math.pow(height, degree);
        double bmi = (double) weight / heightPowed;
        return bmi;
    }
}
