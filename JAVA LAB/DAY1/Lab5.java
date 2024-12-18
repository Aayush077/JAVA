
/*
 * Write a program in Java to take first name and last name from user and print
both in one line as last name followed by first name
 */

import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);{
            System.out.print("Enter the first name: ");
            String first = st.next();
            System.out.print("Enter the last name: ");
            String last = st.next();
            System.out.println("Full name: "+last+" "+first);
            st.close();
        }
    }
    
}
