import java.util.Scanner;
public class MProblem3 {
    public static double x = 0;
    public static double max = 0;
    public static void main(String args[]){
        boolean check = true;
        while (check){
            System.out.print("Enter the number of students : ");
            Scanner input = new Scanner(System.in);
            int numStudents = input.nextInt();
            if (numStudents <= 0){
                System.out.println("The number of students can't be <= 0 !!");
                check = false;
            } else {
                double[] grades = new double[numStudents];
                for (int i = 0; i < numStudents; i++){
                    System.out.print("Enter the grade for student " + (i + 1) + " : ");
                    double grade = input.nextDouble();
                    if (grade < 0 || grade > 100){
                        System.out.println("The grades should be from 0 to 100 !!");
                        check = false;
                        break;
                    }
                    grades[i] = grade;
                }
                
                if (check == false){
                    break;
                }

                for (int i = 0; i < numStudents; i++){
                    x += grades[i];
                }

                double min = grades[0];

                for (int i = 0; i < numStudents; i++){
                    if (grades[i] < min){
                        min = grades[i];
                    }
                }

                for (int i = 0; i < numStudents; i++){
                    if (grades[i] > max){
                        max = grades[i];
                    }
                }

                double ave = x / numStudents;

                System.out.printf("The average is : %.2f\n", ave);
                System.out.println("The minimum is : " + min);
                System.out.println("The maximum is : " + max);
                check = false;
            }
        }
    }
}
