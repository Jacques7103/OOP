import java.util.Scanner;
public class MProblem2 {
    public static String printArrayInStars(){
        boolean check = true;
        while (check){
            System.out.print("Enter the number of items : ");
            Scanner input = new Scanner(System.in);
            int NUM_ITEMS = input.nextInt();
            if (NUM_ITEMS <= 0){
                System.out.println("The number of items can't be <= 0 !!");
                check = false;
            } else {
                int[] intArray = new int[NUM_ITEMS];
                while (check){
                    System.out.print("Enter the value of all items (separated by space & no negative numbers) : ");
                    Scanner input2 = new Scanner(System.in);
                    String items = input2.nextLine();
                    String[] split = items.split("\\s+");
                    if (NUM_ITEMS < split.length){
                        System.out.println("You inputed more than " + NUM_ITEMS + " numbers !!");
                        check = false;
                    } else if (NUM_ITEMS > split.length) {
                        System.out.println("You inputed less than " + NUM_ITEMS + " numbers !!");
                        check = false;
                    } else {
                        int i = 0;
                        while (i < NUM_ITEMS){
                            int x = Integer.parseInt(split[i]);
                            if (x < 0){
                                System.out.println("The value can't be negative numbers !!");
                                check = false;
                                break;
                            } else {
                                intArray[i] = x;
                                i++;
                            }
                        }
                    }
                    if (check == false){
                        break;
                    } else {
                        for (int i = 0; i < NUM_ITEMS; i++){
                            String str = "*";
                            String output = str.repeat(intArray[i]);
                            System.out.println(i + ": " + output + " (" + intArray[i] + ")");
                        }
                        check = false;
                    }
                }
            }
        }
        return "";
    }
    public static void main(String args[]){
        printArrayInStars();
    }
}