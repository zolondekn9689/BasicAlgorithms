
import java.awt.Point;
import java.util.Random;

/**
 * @author Nick Zolondek
 *
 */
public class BruteForceDriver {

	public static void main(String[] args) {


		int n = 1000;
		Random random = new Random();
		int[] list = new int[n];
		for(int i = 0; i < n ; i++ ) {
			list[i]= random.nextInt(n*10);
		}
		
		BruteForceAlgorithms brute = new BruteForceAlgorithms();
		//print random array
		brute.printArray(list);
		//sort list
		brute.selectionSort(list);
		//Use brute to print out sorted array
		brute.printArray(list);

		//TODO Test SequentialSort
		int k = 4;
		int tArray[] = {1, 3, 4, 5, 6, 4, 3, 7, 78, 454, 56};
		System.out.print("Index: ");
		System.out.println(brute.sequentialSearch(tArray, k));



		//TODO Test SelectionSort
		brute.selectionSort(tArray);
		brute.printArray(tArray);

		//TODO Test BruteForceStringMatch
		String example1 = "John Nick Z";
		String example2 = "Nick";
		System.out.printf("\nBruteForceStringMatch: %d\n", brute.bruteForceStringMatch(example1, example2));


		//TODO Test BruteForceClosestPoints
		Point[] points = new Point[3];
		points[0] = new Point(1,1);
		points[1] = new Point(5,5);
		points[2] = new Point(2,2);
		
		Point[] twoClosest = brute.bruteForceClosestPoints(points);
		System.out.println("The closest two points are: ");

		//Note: More testing is done in: BruteForceAlgorithmsTest

		for(int i = 0; i< twoClosest.length; i++)
			System.out.println(twoClosest[i]);

		
	}
}
