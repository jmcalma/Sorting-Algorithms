//Jerahmeel Calma
//CS331 Project 1
public class QuickSort1 {
	
	private int[] A;

	public QuickSort1(int[] input) {
		A = input;
	}
	
	public void quicksort1(int p, int q) {
		if(p < q) {
			int pivotposition = Partition(p, q);
			quicksort1(p, pivotposition);
			quicksort1(pivotposition+1, q);
		}
	}
	
	public int Partition(int first, int last) {
		int pivot = A[first];
		int tb = first + 1;
		int ts = last;
		int temp;
		while(tb <= ts) {
			while(tb <= last && A[tb] < pivot) {
				tb++;
			}
			while(ts > first && A[ts] > pivot) {
				ts--;
			}
			if(tb <= ts) {
				temp = A[tb];
				A[tb] = A[ts];
				A[ts] = temp;
				tb++;
				ts--;
			}
		}
		if(A[first] > A[ts]){
			A[first] = A[ts];
			A[ts] = pivot;
		}
		return ts;
	}
	
	public void getArrayQS1() {
		System.out.print("Sorted array: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
}
