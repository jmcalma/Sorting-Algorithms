//Jerahmeel Calma
//CS331 Project 1
import java.util.Random;
import java.io.*;
public class CS331_Project1 {

	public static void main(String[] args) throws IOException {
		int[] unsorted;
		int[] sorted;
		long startTime, stopTime;
		long totalTime1 = 0, totalTime2 = 0, totalTime3 = 0, totalTime4 = 0, totalTime5 = 0;
		int size = 1;
		Random rand = new Random();
		File file = new File("output.txt");
		FileWriter fw = new FileWriter(file);
		
		for(int a = 1; a <= 16; a++) {
			size *= 2;
			unsorted = new int[size];
			if(size <= 32) {
				System.out.print("Unsorted array: ");
			}
			fw.write("\n" + "Array of size " + size + ":");
			for(int i = 0; i < size; i++) {
				unsorted[i] = rand.nextInt(1000);
				if(size <= 32) {
					System.out.print(unsorted[i] + " ");
				}
			}
			fw.write("\n");
			if(size <= 32) {
				System.out.println();
			}
			
			sorted = unsorted;
			
			InsertionSort item1 = new InsertionSort(sorted);
			MergeSort item2 = new MergeSort(sorted);
			QuickSort1 item3 = new QuickSort1(sorted);
			QuickSort2 item4 = new QuickSort2(sorted);
			QuickSort3 item5 = new QuickSort3(sorted);
			for(int i = 0; i < 10; i++) {
				sorted = unsorted;
				startTime = System.currentTimeMillis();
				item1.insertionsort();
				stopTime = System.currentTimeMillis();
				totalTime1 = totalTime1 + (stopTime - startTime);
				
				sorted = unsorted;
				
				startTime = System.currentTimeMillis();
				item2.mergesort(0, sorted.length-1);
				stopTime = System.currentTimeMillis();
				totalTime2 = totalTime2 + (stopTime - startTime);
				
				sorted = unsorted;
				
				startTime = System.currentTimeMillis();
				item3.quicksort1(0, sorted.length-1);
				stopTime = System.currentTimeMillis();
				totalTime3 = totalTime3 + (stopTime - startTime);
				
				sorted = unsorted;
				
				startTime = System.currentTimeMillis();
				item4.quicksort2();
				stopTime = System.currentTimeMillis();
				totalTime4 = totalTime4 + (stopTime - startTime);
				
				sorted = unsorted;
				
				startTime = System.currentTimeMillis();
				item5.quicksort3(0, sorted.length-1);
				stopTime = System.currentTimeMillis();
				totalTime5 = totalTime5 + (stopTime - startTime);
			}
			if(size <= 32) {
				item1.getArrayIS();
				System.out.println();
			}
			fw.write(" The average time for Insertion Sort is " + totalTime1/10 + " milliseconds");
			fw.write("\n The average time for Merge Sort is " + totalTime2/10 + " milliseconds");
			fw.write("\n The average time for Quick Sort1 is " + totalTime3/10 + " milliseconds");
			fw.write("\n The average time for Quick Sort2 is " + totalTime4/10 + " milliseconds");
			fw.write("\n The average time for Quick Sort3 is " + totalTime5/10 + " milliseconds");
			
			//sorted array
			totalTime1 = 0;
			totalTime2 = 0;
			totalTime3 = 0;
			totalTime4 = 0;
			totalTime5 = 0;
			
			
			for(int i = 0; i < 10; i++) {
				startTime = System.currentTimeMillis();
				item1.insertionsort();
				stopTime = System.currentTimeMillis();
				totalTime1 = (stopTime - startTime);

				startTime = System.currentTimeMillis();
				item2.mergesort(0, sorted.length-1);
				stopTime = System.currentTimeMillis();
				totalTime2 = (stopTime - startTime);

				startTime = System.currentTimeMillis();
				item3.quicksort1(0, sorted.length-1);
				stopTime = System.currentTimeMillis();
				totalTime3 = (stopTime - startTime);

				startTime = System.currentTimeMillis();
				item4.quicksort2();
				stopTime = System.currentTimeMillis();
				totalTime4 = (stopTime - startTime);

				startTime = System.currentTimeMillis();
				item5.quicksort3(0, sorted.length-1);
				stopTime = System.currentTimeMillis();
				totalTime5 = (stopTime - startTime);
			}
			fw.write("\n\n The average time for Insertion Sort is " + totalTime1/10 + " milliseconds");
			fw.write("\n The average time for Merge Sort is " + totalTime2/10 + " milliseconds");
			fw.write("\n The average time for Quick Sort1 is " + totalTime3/10 + " milliseconds");
			fw.write("\n The average time for Quick Sort2 is " + totalTime4/10 + " milliseconds");
			fw.write("\n The average time for Quick Sort3 is " + totalTime5/10 + " milliseconds\n");
		}
		fw.close();
	}
}
