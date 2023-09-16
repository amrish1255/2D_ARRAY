package Assignment_4;

import java.util.*;

public class imageRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		ImageRotate(arr);
	}

	public static void ImageRotate(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		while (minr < maxr && minc < maxc) {
			for (int i = maxc; i >= minc; i--) {
				for (int j = minr; j < arr.length; j++) {
					System.out.print(arr[j][maxc] + " ");
				}
				maxc--;
				System.out.println();
			}

		}
	}

}
