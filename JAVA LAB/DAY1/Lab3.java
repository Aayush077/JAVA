/*
Write a program to print the week day for the given day no. of the current
month using switch case statement
*/
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);{
            System.out.print("Enter the day number: ");
            int day = st.nextInt();
            switch(day){
                case 1 -> System.out.println("Sunday");
                case 2 -> System.out.println("Monday");
                case 3 -> System.out.println("Tuesday");
                case 4 -> System.out.println("Wednesday");
                case 5 -> System.out.println("Thursday");
                case 6 -> System.out.println("Friday");
                case 7 -> System.out.println("Saturday");
                default -> System.out.println("Invalid day number");
            }
            st.close();
        }
    }
}