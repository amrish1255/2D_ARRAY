package Assignment_4;
import java.util.*;

public class transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[][] arr = new int[n][n];
		for (int i= 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		trans(arr);
		for (int i= 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		
	}

	public static void trans(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr[0].length; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;

			}
		}
	

	}

}
