package Sanket3;

import java.util.Arrays;

public class AlbetOrrNot {

	 public static void main(String[] args) {

	      int rows = 2, columns = 3;
	        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
	        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

	        // Adding Two matrices
	        int[][] sum = new int[rows][columns];
	        for(int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
	            }
	        }

	        
	        	
	        	
	        System.out.println("Sum of two matrices : XYX" + sum);

  ;
	            }

	    }
