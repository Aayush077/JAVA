/*
Write a program to print the corresponding grade for the given
mark using if..else statement in Java
Input: Mention the grade in the program
Output: Display the Grade either O/E/A/B/C
 */
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);{
            System.out.print("Enter the marks: ");
            int marks = st.nextInt();
            if(marks>=90){
                System.out.println("Grade: O");
            }
            else if(marks>=80){
                System.out.println("Grade: E");
            }
            else if(marks>=70){
                System.out.println("Grade: A");
            }
            else if(marks>=60){
                System.out.println("Grade: B");
            }
            else if(marks>=50){
                System.out.println("Grade: C");
            }
            else{
                System.out.println("Grade: F");
            }
            st.close();
       }
    }
}