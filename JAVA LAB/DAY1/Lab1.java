/*to print your name, rollno,section,and branch in seperate lines
*/
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
    Scanner st = new Scanner(System.in);{
    String Name, Roll, Section, Branch;

    System.out.print("Enter the name: ");
    Name = st.next();
    System.out.print("Enter the Roll no: ");
    Roll = st.next();
    System.out.print("Enter the Section: ");
    Section = st.next();
    System.out.print("Enter the Branch: ");
    Branch = st.next();
    System.out.println("Name of student is: "+Name+".\n"+"Roll no. of student is: "+Roll+".\n"+"Section is: "+Section+".\n"+"Branch is: "+Branch+".\n");
    st.close();
        }    
    }
}
