import java.util.Scanner;
import java.lang.Math;
public class Forum_1 {
    public static String Seven(){
        int a;
        int b;
        int result;

        a = 4;
        b = 12;
        int result1 = a + b / 3;

        a = 3;
        a = a + 3;
        b = 2;
        int result2 = a - b;
        
        a = 2;
        b = a + 1;
        a = b + 2;
        result = a + b + a;
        int result3 = -result;

        a = 3;
        b = 11;
        int result4 = (b % a) + 1;

        a = 3;
        b = a++;
        int result5 = 1;
        result5 += a - b;

        String s = "jjj";
        String t = "xxx";
        String result6 = s + s + t;
        return "7.a - " + result1 + "\n7.b - " + result2 + "\n7.c - " + result3 + "\n7.d - " + result4 + "\n7.e - " + result5 + "\n7.f - " + result6;
    }

    public static String Eight(){
        return  "*********      ***        *          *\n" +
                "*       *    *     *     ***        * *\n" +
                "*       *   *       *   *****      *   *\n" +
                "*       *   *       *     *       *     *\n" +
                "*       *   *       *     *      *       *\n" +
                "*       *   *       *     *       *     *\n" +
                "*       *   *       *     *        *   *\n" +
                "*       *    *     *      *         * *\n" +
                "*********      ***        *          *";

    }

    public static String Nine(){
        System.out.print("Enter the celcius degrees : ");
        Scanner input = new Scanner(System.in);
        float celcius = input.nextFloat();
        float fahrenheit = (celcius / 5 * 9) + 32;
        return celcius + " Celcius degrees are " + fahrenheit + " Fahrenheit degrees";
    }

    public static String Ten(){
        System.out.print("Enter X1 : ");
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        System.out.print("Enter X2 : ");
        int x2 = input.nextInt();
        System.out.print("Enter X3 : ");
        int x3 = input.nextInt();

        float mean = (x1 + x2 + x3) / 3;
        double variance = (Math.pow((x1 - mean), 2) + Math.pow((x2 - mean), 2) + Math.pow((x3 - mean), 2)) / 3;
        double deviation = Math.sqrt(Math.pow(variance, 2));
        return "Mean = " + mean + "\nVariance = " + variance + "\ndeviation = " + deviation;
    }

    public static String Eleven(int a, int b){
        int num = a;
        a = b;
        b = num;
        return "You successfully changed 'a' into " + a + " and 'b' into " + b;
    }

    public static String Twelve(){
        System.out.println("Number\t Square\t  Cube");

        for (int i = 0; i <= 10; i++){
            System.out.println(i + "\t " + (int) Math.pow(i, 2) + "\t  " + (int) Math.pow(i, 3));
        };
        return "";
    }

    public static String Thirteen(){
        System.out.print("Enter number of 'a' : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Enter number of 'b' : ");
        int b = input.nextInt();
        System.out.print("Enter number of 'c' : ");
        int c = input.nextInt();

        if (a == 0){
            return "Undefined";
        }
        else {
            return "X1 = " + ((-b + Math.sqrt((double) Math.pow(b, 2) - 4 * a * c)) / 2 * a) + "\nX2 = " + ((-b - Math.sqrt((double) Math.pow(b, 2) - 4 * a * c)) / 2 * a);
        }
    }

    public static String Fourteen(){
        System.out.print("Enter the seconds to convert : ");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();

        int hour = seconds / 3600;
        int minutes = (seconds / 60) % 60;
        int sec_left = seconds % 60;

        return seconds + " seconds are " + hour + " hour, " + minutes + " minutes, and " + sec_left + " seconds.";
    }

    public static void main(String args[]){
        System.out.println("Number 7\n=========================================================");
        System.out.println(Seven());
        System.out.println("\nNumber 8\n=========================================================");
        System.out.println(Eight());
        System.out.println("\nNumber 9\n=========================================================");
        System.out.println(Nine());
        System.out.println("\nNumber 10\n=========================================================");
        System.out.println(Ten());
        System.out.println("\nNumber 11\n=========================================================");
        System.out.println(Eleven(1, 3));
        System.out.println("\nNumber 12\n=========================================================");
        System.out.println(Twelve());
        System.out.println("Number 13\n=========================================================");
        System.out.println(Thirteen());
        System.out.println("\nNumber 14\n=========================================================");
        System.out.println(Fourteen());
    }
}