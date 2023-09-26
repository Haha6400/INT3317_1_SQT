import java.util.Scanner;
public class TDEEcalculate {

    public static String calculateTDEE(double bmr, double r, double dailyCalories) {
        String res = "";
        if (bmr < 0.0 || r < 1.2 || r > 1.9 || dailyCalories <= 0.0) {
            res = "Invalid input";
        }
        double tdee = bmr * r;
        tdee = (double) Math.round(tdee * 10) / 10;
        if (dailyCalories < tdee) {
            res = "Need to intake about " + (- dailyCalories + tdee) + " calories per day.";
        }
        else if (dailyCalories == tdee) {
            res = "You are maintaining a healthy weight.";
        }
        else {
            res = "Need to reduce about " + (dailyCalories  - tdee) + " calories per day.";
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bmr = scanner.nextDouble();
        double r = scanner.nextDouble();
        double dailyCalories = scanner.nextDouble();
        scanner.close(); 
        System.out.println(calculateTDEE(bmr, r, dailyCalories));
    }
    
}
