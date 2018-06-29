import java.util.Arrays;

public class HelloWorld {
	
	public static void main(String args[]) {
		// Declare an Array. All below ways are legal.
		int marks[]; // Not Readable
		int[] runs; // Not Readable
		int[] temperatures;// Recommended

		// Declaration of an Array should not include size.
		// int values[5];//Compilation Error!

		// Declaring 2D ArrayExamples
		int[][] matrix1; // Recommended
		int[] matrix2[]; // Legal but not readable. Avoid.

		// Creating an array
		marks = new int[5]; // 5 is size of array

		// Size of an array is mandatory to create an array
		// marks = new int[];//COMPILER ERROR

		// Once An Array is created, its size cannot be changed.

		// Declaring and creating an array in same line
		int marks2[] = new int[5];

		// new Arrays are alway initialized with default values
		System.out.println(marks2[0]);// 0

		// Default Values
		// byte,short,int,long-0
		// float,double-0.0
		// boolean false
		// object-null

		// Assigning values to array
		marks[0] = 25;
		marks[1] = 30;
		marks[2] = 50;
		marks[3] = 10;
		marks[4] = 5;

		// ArrayOnHeap.xls

		// Note : Index of an array runs from 0 to length - 1

		// Declare, Create and Initialize Array on same line
		int marks3[] = { 25, 30, 50, 10, 5 };

		// Leaving additional comma is not a problem
		int marks4[] = { 25, 30, 50, 10, 5, };

		// Default Values in Array
		// numbers - 0 floating point - 0.0 Objects - null

		// Length of an array : Property length
		int length = marks.length;

		// Printing a value from array
		System.out.println(marks[2]);

		// Looping around an array - Enhanced for loop
		for (int mark : marks) {
			System.out.println(mark);
		}

		// Fill array with same default value
		Arrays.fill(marks, 100); // All array values will be 100

		// Access 10th element when array has only length 5
		// Runtime Exception : ArrayIndexOutOfBoundsException
		// System.out.println(marks[10]);

		// String Array: similar to int array.
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday" };

		// Array can contain only values of same type.
		// COMPILE ERROR!!
		// int marks4[] = {10,15.0}; //10 is int 15.0 is float

		// Cross assigment of primitive arrays is ILLEGAL
		int[] ints = new int[5];
		short[] shorts = new short[5];
		// ints = shorts;//COMPILER ERROR
		// ints = (int[])shorts;//COMPILER ERROR

		// 2D Arrays
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] matrixA = new int[5][6];

	}
}