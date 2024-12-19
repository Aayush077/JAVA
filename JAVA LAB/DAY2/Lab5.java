import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find occurrences
        System.out.println("Occurrences of each element:");
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                visited[i] = true;

                for (int j = i + 1; j < n; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(numbers[i] + " occurs " + count + " times");
            }
        }

        scanner.close();
    }
}
}