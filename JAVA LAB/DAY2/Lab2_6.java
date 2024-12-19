/*
 * Find sum of each diagonal (left &amp; right) elements separately of a user
entered 3 X 3 matrix in Java.

Input: Enter 3X3 matrix
e.g. 6 7 3
8 9 2
1 2 9
Output: Left=24
Right=13
 */

import java.util.Scanner;
public class Lab2_6 {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);{
			int[][] matrix = new int[3][3];
			System.out.println("Enter 3X3 matrix");
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					matrix[i][j] = st.nextInt();
				}
			}
			int left = 0;
			int right = 0;
			for(int i=0; i<3; i++){
				left += matrix[i][i];
				right += matrix[i][2-i];
			}
			System.out.println("Left="+left);
			System.out.println("Right="+right);
			st.close();
		}
	}
}