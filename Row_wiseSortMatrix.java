package Assignment_4;

import java.util.*;

public class Row_wiseSortMatrix {

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
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void sort(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
//		
//loop  for row

		for (int i = 0; i < arr.length; i++) {
			// loop for 1St column
			for (int j = 0; j < arr[0].length; j++) {
//				loop for 2nd column 
				for (int k = j + 1; k < arr[0].length; k++) {
					if (arr[i][j] > arr[i][k]) {
						int temp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = temp;

					}

				}

			}
			minr++;
		}

	}
}
