//Jerahmeel Calma
//CS331 Project 1
public class InsertionSort {

	private int[] input;
	
	public InsertionSort(int[] A) {
		input = A;
	}
	
	public void insertionsort() {
		int target, j;
		for(int i = 1; i < input.length; i++) {
			target = input[i];
			j = i-1;
			while(j >= 0 && target < input[j]) {
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = target;
		}
	}
	
	public void getArrayIS() {
		System.out.print("Sorted array: ");
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}
	
}
