//Jerahmeel Calma
//CS331 Project 1
public class QuickSort2 {

	private int[] A;
	
	public QuickSort2(int[] input) {
		A = input;
	}
	
	public void quicksort2() {
		if(A.length <= 16) {
			InsertionSort item = new InsertionSort(A);
			item.insertionsort();
		}else {
			QuickSort1 item = new QuickSort1(A);
			item.quicksort1(0, A.length-1);
		}
	}
	
	public void getArrayQS2() {
		System.out.print("Sorted array: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
}
