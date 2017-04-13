//Jerahmeel Calma
//CS331 Project 1
public class MergeSort {
	
	private int[] A;
	private int[] U;
	
	public MergeSort(int[] a){
		A = a;
		U = new int[a.length];
	}

	public void mergesort(int low, int high) {
		if(low < high) {
			int mid = (low + high) / 2;
			mergesort(low, mid);
			mergesort(mid+1, high);
			merge(low, mid, high);
		}
	}
	
	private void merge(int low, int mid, int high) {
		int i = low;
		int j = mid+1;
		int k = low;
		while(i <= mid && j<= high) {
			if(A[i] <= A[j]) {
				U[k] = A[i];
				i++;
			}else {
				U[k] = A[j];
				j++;
			}
			k++;
		}
		if(i > mid) {
			for(int x = j; x <= high; x++) {
				U[k] = A[x];
				k++;
			}
		}else {
			for(int x = i; x <= mid; x++) {
				U[k] = A[x];
				k++;
			}
		}
		for(int p = low; p <= high; p++) {
			A[p] = U[p];
		}
	}
	
	public void getArrayMS() {
		System.out.print("Sorted array: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
}
