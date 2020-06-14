package ArrayInJava;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// stores data in row and column  (R*C)
		String x[][]  = new String[2][3];
		
		x[0][0] = "Name";
		x[0][1] = "tom";
		x[0][2] = "jonny";
		x[1][0] = "Megh";
		x[1][1] = "shravs";
		x[1][2] = "java";
		
		System.out.println("The length of row is : "   +x.length) ;  // print number of row
		System.out.println("The length of Column is : "   +x[0].length) ; // print number of column
		
		System.out.println("The value of array  :"   +x[0][2]) ;
		
		// To print all the values of Two D array 
		
		for (int row = 0 ; row < x.length ; row++) {
			for (int col = 0 ; col < x[0].length ; col++){
				System.out.println("The values of the arrays are : "  +x[row][col]) ;
			}
		}
		
		
	}

}
