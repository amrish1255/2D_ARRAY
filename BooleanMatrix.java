package Assignment_4;

import java.util.Scanner;

public class BooleanMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		BooleanMatrix(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void BooleanMatrix(int[][] arr) {
		int i = 0;
		int j = 0;
		while (i <= j) {
			for (i = 0; i < arr.length; i++) {
				for (j = i+1; j < arr[0].length; j++) {
					if (arr[i][j]==0) {
						arr[i][j] = 1;
						break;

					
					}

				}

			}

		}
	}

}
//2 2
//1 0
//0 0
