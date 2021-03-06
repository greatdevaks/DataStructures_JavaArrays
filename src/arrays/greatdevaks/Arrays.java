package arrays.greatdevaks;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring an array using literals
		int my_arr[] = new int[] {1, 2, 3, 4, 5};
		System.out.println("Printing an array:");
		for(int i = 0; i < my_arr.length; i++) {
			System.out.println(my_arr[i]);
		}
		
		//declaring and initializing an array
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		//traversing linear array and printing
		TraversingLinearArray_P1 objTLA = new TraversingLinearArray_P1();
		System.out.println("\nTraversing Linear Array:");
		objTLA.TraversingLinearArray(arr);
		
		//traversing linear array, performing operations, and getting modified array
		int mod_arr[] = objTLA.ReturningProcessedLinearArray(arr);
		System.out.println("\nModified array:");
		for(int i = 0; i < mod_arr.length; i++) {
			System.out.println(mod_arr[i]);
		}
		
		//creating array of objects
		ArrayOfObjects objAOO[] = new ArrayOfObjects[2];
		Random rand = new Random();
		String text[] = {"A", "B", "C", "D", "E"};
		//setting value for objects
		for(int i = 0; i < objAOO.length; i++) {
			objAOO[i] = new ArrayOfObjects(text[rand.nextInt(text.length)], rand.nextInt(50) + 1);
		}
		System.out.println("\nArray of Objects:");
		//getting value of objects
		for(int i = 0; i < objAOO.length; i++) {
			System.out.println("Object: " + (i + 1));
			System.out.println("Name: " + objAOO[i].name);
			System.out.println("Age: " + objAOO[i].age);
		}
		
		//multi-dimensional arrays
		int multi_arr[][] = {{1, 2, 3}, {4, 5, 6}};
		System.out.println("\nMultidimensional Arrays");
		for(int i = 0; i < multi_arr.length; i++) {
			for(int j = 0; j < multi_arr[i].length; j++) {
				System.out.print(multi_arr[i][j]);
			}
			System.out.println();
		}
		
		//jagged arrays
		int j_arr[][] = new int[2][];
		j_arr[0] = new int[3];
		j_arr[1] = new int[2];
		for(int i = 0; i < j_arr.length; i++) {
			for(int j = 0; j < j_arr[i].length; j++) {
				j_arr[i][j] = rand.nextInt(999) + 1;
			}
		}
		System.out.println("\nJagged Arrays:");
		for(int i = 0; i < j_arr.length; i++) {
			for(int j = 0; j < j_arr[i].length; j++) {
				System.out.print(j_arr[i][j]);
			}
			System.out.println();
		}
		
		//for-each loop
		System.out.println("\nFor-each loop:");
		int fe_arr[] = {1, 2, 3};
		for(int i : fe_arr) {
			System.out.println(i);
		}
		
		//matrix multiplication
		int mat_a[][] = {{1, 2, 3}, {4, 5, 6}};
		int mat_b[][] = {{1, 2}, {1, 1}, {1, 1}};
		int count_b = 0;
		for(int i = 0; i < mat_b.length; i++) {
			for(int j = 0; j < mat_b[i].length; j++) {
				count_b++;
			}
		}		
		int mul_arr[][] = new int[mat_a.length][count_b / mat_b.length];
		for(int i = 0; i < mat_a.length; i++) {
			for(int j = 0; j < count_b / mat_b.length; j++) {
				mul_arr[i][j] = 0;
				for(int k = 0; k < mat_b.length; k++) {
					mul_arr[i][j] = mul_arr[i][j] + (mat_a[i][k] * mat_b[k][j]);
				}
			}
		}
		System.out.println("\nMatrix Multiplcation:");
		for(int i = 0; i < mul_arr.length; i++) {
			for(int j = 0; j < mul_arr[i].length; j++) {
				System.out.print(mul_arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
