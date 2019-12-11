package Assignment;

import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of matrix:- ");
		int rows=sc.nextInt();
		System.out.println("Enter the columns of the matrix:- ");
		int cols=sc.nextInt();
		int mat[][]=new int[rows][cols];
		System.out.println("Enter the elements:- ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		printSpiral(mat, rows, cols, 0, 0);
		sc.close();
	}
	public static void printSpiral(int mat[][], int rows, int cols, int row_start, int col_start) {
		if(row_start>=rows || col_start>=cols) {
			return;
		}
		for(int i=row_start;i<cols;i++) {
			System.out.print(mat[row_start][i]+" ");
		}
		for(int j=row_start+1;j<rows;j++) {
			System.out.print(mat[j][cols-1]+" ");
		}
		for(int k=cols-2;k>=col_start;k--) {
			System.out.print(mat[rows-1][k]+" ");
		}
		for(int l=rows-2;l>row_start;l--) {
			System.out.print(mat[l][col_start]+" ");
		}
		printSpiral(mat, rows-1, cols-1, row_start+1, col_start+1);
	}
}
