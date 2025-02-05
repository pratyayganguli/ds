package org.example.matrix;

class ExampleMatrix {

	/**
	 * 
	 * will be completing the logic tomorrow...
	 * 
	 * 1 4 5
	 * 7 2 3
	 * 4 6 1
	 *  
	 */
	
	private static void printSpiral(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(i == 0) {
					System.out.print(matrix[i][j] +  " ");
				}
			} 
		}

	}
}