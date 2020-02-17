import java.awt.Point;



/**
 * @author Nick Zolondek
 *
 */
public class BruteForceAlgorithms implements BruteForcible {

	@Override
	/**
	 * ALGORITHM SelectionSort(A[0..n-1])
	 * Sorts a given array A by selection sort
	 * Input: An array of A[0..n-1] of orderable elements
	 * Output: Array A[0..n-1] sorted in ascending order
	 * for i = 0 to n-2 do
	 * 	min = i;
	 *  for j=i+1 to n-1 do
	 *  	if A[j] < A[min]    min = j
	 *  swap A[i] and A[min]
	 *
	 * @param A - Array of orderable elements
	 */
	public void selectionSort(int[] A) {
		int min = 0;

		//for i = 0 to n-2 do
		for(int i = 0; i<= A.length-2; i++) {
			 	min = i; //min = i;
			 	//for j=i+1 to n-1 do
			 	for (int j=i+1; j <= A.length-1; j++) {
			 		//if A[j] < A[min]    min = j
			 		if (A[j] < A[min]   ) 
			 				min = j;
			 	}
			 	//swap A[i] and A[min]
			 	int temp = A[i];
			 	A[i] = A[min];
			 	A[min] = temp;
		}
	}

	/**
	 * SequentialSearch.
	 * @param A an array to be searched.
	 * @param K a value to be searched.
	 * @return Index of the first character in the text that starts matching substring or -1 if
	 * the search is unsuccessful.
	 */
	@Override
	public int sequentialSearch(int[] A, int K)
	{
		//Declare two variables from the naming convention of psuedocode.
		int n = A.length;
		int i = 0;

		// while i < n and A[i] != K do
		while (i < n && A[i] != K)
		{
			// i <-- i + 1
			i++;
		}

		// If the index is less than the length.
		if (i < n)
		{
			//return i
			return i;
		} else {
			//return -1.
			return -1;
		}
	}

	/**
	 *
	 * @param T A strign you want to compare.
	 * @param P a substring.
	 * @return The index of the first character in the text that starts a matchng substing or -1 if the search is
	 * unsuccessful.
	 */
	@Override
	public int bruteForceStringMatch(String T, String P) {
		//initalize n and m.
		int n = T.length(), m = P.length();

		// Psuedocode: for i <-- 0 to n - m do
		for (int i = 0; i < n - m + 1; i++)
		{
			// j <-- 0
			int j = 0;

			// while j < m and P[j] = T[ i + j] do
			while (j < m && P.charAt(j) == T.charAt(i + j))
			{
				// j <-- j + 1
				j++;
			}

			// if j = m return i
			if (j == m) {
				return i;
			}
		}

		//return -1
		return -1;
	}

	/**
	 * Find two closest points.
	 * @param P An array of points to compare.
	 * @return two points closest to each other.
	 */
	@Override
	public Point[] bruteForceClosestPoints(Point[] P) {

		int index1=0, index2=0;

		//Initialize dmin <-- infinity
		double dmin = Integer.MAX_VALUE;

		// length of P.
		int n = P.length;

		// for i <-- 1 to n - 1 do
		for (int i = 0; i < n - 1; i++)
		{
			// for j <-- i + 1 to n do
			for (int j = i + 1; j < n; j++)
			{
				//Just a few variables.
				double XatI = P[i].getX();
				double XatJ = P[j].getX();

				double d = Math.sqrt(Math.pow(XatI - XatJ, 2) + Math.pow(P[i].getY() - P[j].getY(), 2));

				// if d < dmin
				if (d < dmin)
				{
					//Update variables.
					dmin = d; index1 = i; index2 = j;
				}
			}
		}

		
		//use index1 and index2 to make an array of two points to return
		Point[] closest = new Point[2];
		closest[0] = P[index1];
		closest[1] = P[index2];
		return closest;
	}

	/**
	 * Print every item from the array.
	 * @param data the array being printed.
	 */
	public void printArray(int[] data) {
		for(int i=1; i<= data.length; i++) {
			System.out.printf("%,9d" , data[i-1] );
			//System.out.printf(Locale.US, "%,d %n", 10000);
			if(i%20 == 0 && i > 0)
				System.out.println();
		}
	}
}
