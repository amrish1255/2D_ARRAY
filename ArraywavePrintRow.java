package Assignment_4;

import java.util.*;

public class ArraywavePrintRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

//		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		wave(arr);

	}

	// This is only for Square matrix;

//	public static void waveprint(int arr[][]) {
//		int maxr = arr.length - 1;
//		int minr = 0;
//		int maxc = arr[0].length - 1;
//		int minc = 0;
//		while (minr <= maxr) {
//			for (int i = minc; i <= maxc; i++) {
//				System.out.print(arr[minr][i] + " ");
//			}
//			minr++;
//			for (int i = maxc; i >= minc; i--) {
//				System.out.print(arr[minr][i] + " ");
//			}
//			minr++;
//		}

//	}
//this is used for square or non square matrix
	public static void wave(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		while (minr <= maxr) {
			if (minr % 2 == 0) {
				for (int i = minc; i <= maxc; i++) {
					System.out.print(arr[minr][i] + " ");
				}
				minr++;
			} else {
				for (int i = maxc; i >= minc; i--) {
					System.out.print(arr[minr][i] + " ");
				}
				minr++;
			}

		}
		System.out.println("end");
	}
}