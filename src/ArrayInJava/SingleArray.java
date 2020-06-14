package ArrayInJava;

public class SingleArray {

	public static void main(String[] args) {

		int a[] = new int[4]; // int[] a = new int[];

		a[0] = 24;
		a[1] = 29;
		a[2] = 90;
		a[3] = 25;

		System.out.println(" Lenth of the given array : " + a.length); // print
																		// the
																		// length
																		// of
																		// the
																		// array

		System.out.println("Value of 3rd index array is :" + a[3]);

		// To print all the values of array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("-----------Using Object Array----------");

		// Object Array

		Object obj[] = new Object[3];
		obj[0] = "Tom";
		obj[1] = 25;
		obj[2] = 'A';

		for (int j = 0; j < obj.length; j++) {
			System.out.println("Values of object array : " + obj[j]);
		}

	}

}
