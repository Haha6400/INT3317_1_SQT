import java.util.Scanner;
public class Program {
    private int age; 
    private String status; 
    public static String moneyPay(int age){
        if (age <= 0 || age >100) return "Invalid input";
        else if (age < 6) return "Free!";
        else if (age >= 6 && age <= 60) return "100.000 VND per ticket.";
        else return "50.000 VND per ticket.";
    }
    public static String promotionProgram(String status){
        if (status.equals("student")) return "Buy 1 get 1";
        else return "";
    }
    public static String result(int age, String status) {
        if (moneyPay(age).equals("Invalid input")) return "Invalid input. Try again!";
        else {
            return moneyPay(age) + promotionProgram(status);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); 
        String y = scanner.next();
        scanner.close(); 
        System.out.println("With x: " + x + "and y: " + y + ":" + result(x, y));
    }
}