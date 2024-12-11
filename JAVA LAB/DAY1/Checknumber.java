import java.util.Scanner;

class define{
    public void CheckEvenorOdd(int num){
        if(num%2==0) 
            System.out.println("Even Num.");
        else
            System.out.println("Odd Num");
    }

    public void CheckArmstrong(int n){
        int a=n;
        int m =0;
        while(a!=0)
        {
            int r =a%10;
            m =(int)Math.pow(a, r)+m;
            a=a/10;
        }
        if(n==m)
            System.out.println("Armstrong Num");
        else
            System.out.println("Not Armstrong");
    }

    public void CheckPrime(int n){
        if(n<1)
            System.out.println("Neither prime nor compound");
        for (int i =2;i<=n;i++)
        {
            if(n%1==0)
                System.out.println("Prime Num");
        }
        System.out.println("Not Prime Num");
    }
}



public class Checknumber {
    public static void main(String args[]) {
        System.out.println("Enter the Number to check for: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("1.Perfect Square Number\n2.Even or Odd\n3.Prime Number\n4.Armstrong or not\n5.Palindrome or not");
        System.out.println("Enter your choice: ");
        define obj=new define();
        
        int c = scan.nextInt();
        switch(c){
            case 1->obj.CheckPerfect(num);
            case 2->obj.CheckEvenorOdd(num);
            case 3->obj.CheckPrime(num);
            case 4->obj.CheckArmstrong(num);
            case 5->obj.CheckPalindrome(num);
        }
        scan.close();
    }
    
}