package com.guanxu.easy;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int removeElement(int[] A, int elem) {
        // write your code here
        int newLength = A.length;
        for(int i : A){
            if(i == elem)
                newLength--;
        }
        int validIndex = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != elem){
                A[validIndex] = A[i];
                validIndex++;
            }
        }
        return newLength;
    }

}
