package arrays.greatdevaks;

public class TraversingLinearArray_P1 {
	void TraversingLinearArray(int arg_arr[]) {
		for(int i = 0; i < arg_arr.length; i ++) {
			System.out.println("Array Element: " + arg_arr[i] + " at index: " + i + ".");
		}
	}
	
	int[] ReturningProcessedLinearArray(int arg_arr[]) {
		int arr[] = new int[arg_arr.length];
		for(int i = 0; i < arg_arr.length; i ++) {
			arr[i] = arg_arr[i] * 2;
		}
		return arr;
	}
}
