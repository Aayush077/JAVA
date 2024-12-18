import java.util.Scanner;

class Define {
    public void CheckEvenorOdd(int num) {
        if (num % 2 == 0)
            System.out.println("Even Num.");
        else
            System.out.println("Odd Num");
    }

    public void CheckArmstrong(int n) {
        int a = n;
        int m = 0;
        while (a != 0) {
            int r = a % 10;
            m = m + (r * r * r);
            a = a / 10;
        }
        if (n == m)
            System.out.println("Armstrong Num");
        else
            System.out.println("Not Armstrong");
    }

    public void CheckPrime(int n) {
        if (n <= 1) {
            System.out.println("Neither prime nor compound");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime Num");
        else
            System.out.println("Not Prime Num");
    }

    public void CheckPerfect(int n) {
        int m= (int) Math.sqrt(n);
        if (m * m == n)
            System.out.println("Perfect Square Number");
        else
            System.out.println("Not Perfect Square Number");
    }

    public void CheckPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

public class check{
    public static void main(String args[]) {
        Define obj = new Define();
        System.out.println("Enter the Number to check for: ");
        try (Scanner scan = new Scanner(System.in)) {
            int num = scan.nextInt();
            System.out.println("1.Perfect Square Number\n2.Even or Odd\n3.Prime Number\n4.Armstrong or not\n5.Palindrome or not");
            System.out.println("Enter your choice: ");

            int c = scan.nextInt();
            switch (c) {
                case 1 -> obj.CheckPerfect(num);
                case 2 -> obj.CheckEvenorOdd(num);
                case 3 -> obj.CheckPrime(num);
                case 4 -> obj.CheckArmstrong(num);
                case 5 -> obj.CheckPalindrome(num);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}