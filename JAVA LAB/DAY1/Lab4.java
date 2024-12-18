/*
 * Program to check a user entered number is palindrome or not
 */

 import java.util.Scanner;
    public class Lab4 {
        public static void main(String[] args) {
            Scanner st = new Scanner(System.in);{
            System.out.print("Enter the number: ");
            int num = st.nextInt();
            int temp = num;
            int rev = 0;
            while(num>0){
                int rem = num%10;
                rev = rev*10+rem;
                num = num/10;
            }
            if(temp==rev){
                System.out.println("The number is a palindrome");
            }
            else{
                System.out.println("The number is not a palindrome");
            }
            st.close();
            }
        }
    }   