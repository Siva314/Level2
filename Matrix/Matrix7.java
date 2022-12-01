package sorting;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[][] scores = new int[4][4];
	       
        scores[0][0] = 4; scores[0][1] = 1; scores[0][2] = 1;scores[0][3] = 1;
       
        scores[1][0] = 2;scores[1][1] = 3;scores[1][2] = 2;scores[1][3] = 2;
       
        scores[2][0] = 3;scores[2][1] = 3;scores[2][2] = 2;scores[2][3] =3;
        scores[3][0] = 4;scores[3][1] = 4;scores[3][2] = 4;scores[3][3] = 1;
        sortDiagonal(scores);
        for(int i=0;i<4;i++) {
        	for(int j=0;j<4;j++) {
        		System.out.print(scores[i][j]);
        	}
        	System.out.println("");
        }
	}
	public static void sortDiagonal(int[][] arr) {
		int length=arr.length;
		int[] temp=new int[length];
		for(int i=0;i<length;i++) {
			temp[i]=arr[i][i];
		}
		Arrays.sort(temp);
		for(int i=0;i<length;i++) {
			arr[i][i]=temp[i];
		}
	}
}

