package gb.local.HomeWork;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Its first task");
        System.out.println("Enter first number");
        int n = sc.nextInt();
        System.out.println("Enter second number");
        int m = sc.nextInt();
        System.out.println("Chek if the summ of numbers is between ten and twenty ");
        System.out.println(NumInTwnToTwenty(n, m));
        System.out.println("This is second task");
        System.out.println("Ok, please enter number, and i talk for you, positive or negative");
        int f = sc.nextInt();
        System.out.println(NumbersIsPositive(f));
        System.out.println("This is third task");
        System.out.println("Check if number is below zeros");
        int d = sc.nextInt();
        System.out.println(BelowZero(d));
        System.out.println("This is fourth task");
        StringMultipleTimes();
        System.out.println("This is fifth task");
        System.out.println("Is It a leap year");
        System.out.println("Pleace enter any year");
        int year = sc.nextInt();
        System.out.println(LeapYear(year));

    }
    public static boolean NumInTwnToTwenty(int n, int m) {
        boolean result = ((n + m) >= 10) && ((n + m) <= 20) ;
        System.out.println();
        return result;
    }
    public static String NumbersIsPositive(int f) {
        String answer = " ";
        if (f >= 0) {
            answer = "Positive";
        }
        else {
            answer = "Negative";
        }
        return answer;
    }
    public static boolean BelowZero(int d){
        boolean result = d < 0;
        return result;
    }
    public static void StringMultipleTimes(){
        System.out.println("Enter line");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println("Enter number");
        int j = sc.nextInt();
        while (!(j == 0)){
            System.out.println(line);
            j -= 1;
        }
    }
    public static boolean LeapYear(int year) {
        boolean result = false;
        if (year % 4 == 0 && year < 100) {
            result = true;
        }
        else if (year % 400 == 0){
            result = true;
        }
        else if (year % 4 == 0 && !(year % 100 == 0)){
            result = true;
        }
        else
            result = false;
        return result;
    }
}
