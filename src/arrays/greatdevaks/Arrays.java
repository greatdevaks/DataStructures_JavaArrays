package arrays.greatdevaks;

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
	}

}
