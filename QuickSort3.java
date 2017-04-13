//Jerahmeel Calma
//CS331 Project 1
import java.util.Random;
public class QuickSort3 {

	private int[] A;
	
	public QuickSort3(int[] input) {
		A = input;
	}
	
	public void quicksort3(int p, int q) {
		if(p < q) {
			if((q-p+1) >= 16){
				Random rand = new Random();
				int rnum = p + (rand.nextInt(q-p+1));
				int temp = A[p];
				A[p] = A[rnum];
				A[rnum] = temp;
			}
			int pivotposition = Partition(p, q);
			quicksort3(p, pivotposition);
			quicksort3(pivotposition+1, q);
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
	
	public void getArrayQS3() {
		System.out.print("Sorted array: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
}
