package Assignment_4;

import java.util.*;

public class ArraySpiral_print_clockwise {

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
		SpiralClockWise(arr);
	}

	public static void SpiralClockWise(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int te = arr.length * arr[0].length;
		int count = 0;
		while (count < te) {
//			column wise left to right
			for (int i = minc; i <=maxc && count < te; i++) {
				System.out.print(arr[minr][i] + ",");
				count++;
			}
			minr++;

//			row wise top to bottom;
			for (int i = minr; i <= maxr && count < te; i++) {
				System.out.print(arr[i][maxc] + ",");
				count++;
			}
			maxc--;
//			 column wise right to left
			for (int i = maxc; i >= minc && count < te; i--) {
				System.out.print(arr[maxr][i] + ",");
				count++;
			}
			maxr--;
//			row wise down to top
			for (int i = maxr; i >= minr && count < te; i--) {
				System.out.print(arr[i][minc] + ",");
				count++;
			}
			minc++;
		}
		System.out.println("END");
	}

}
