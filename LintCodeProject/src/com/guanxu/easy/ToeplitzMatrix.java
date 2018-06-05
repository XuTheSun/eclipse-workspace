package com.guanxu.easy;

public class ToeplitzMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int[][] {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		System.out.print(isToeplitzMatrix(a));
	}
	
    public static boolean isToeplitzMatrix(int[][] matrix) {
        // Write your code here
        int y = matrix.length;
        int x = matrix[0].length;
        for(int i = 0; i < y - 1; i ++){
            for(int j = 0; j < x - 1; j++){
                if(matrix[i][j] != matrix[i + 1][j + 1]){
                    return false;
                }
            }
        }
        return true;
    }
}
