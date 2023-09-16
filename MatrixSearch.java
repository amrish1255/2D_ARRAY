package Assignment_4;

import java.util.*;

public class MatrixSearch {

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
		int item = sc.nextInt();
		SearchMatrix(arr, item);
		System.out.println(SearchMatrix(arr, item));
	}

	public static int SearchMatrix(int[][] arr, int item) {

		int row = 0;
		int col = 0;
		for (int i = row; i < arr.length; i++) {
			for (int j = col; j < arr[0].length; j++) {
				if (arr[i][j] == item) {
					return 1;

				}
				row++;
			}

		}
		return 0;
	}
}
