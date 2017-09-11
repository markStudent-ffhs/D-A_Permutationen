package ch.ffhs.dua.permutations;


public class Permutations 
{
	/**
	 * Erzeugt ein Array von allen Permutationen von {0,1,2,3,...,n-1}.
	 * @param n Anzahl Elemente in einer Permutation.
	 * @return  Ein Array von Permutationen; jede Permutation ist ein Array von Integern.
	 */
	public static int[][] permutations(int n)
	{
		
		if(size(n) == 0) {
			return  new int[0][0];
		}
		
		
		
		return null;
	}
	
	public static int size (int n) 
	{
		int count = 1;
		for (int i = 2; i <= n; i++) {
			count *= i;
		}
		return count;
	}
	
//	public void permute(int[] arr, int i)
//	{
//	    if (i == arr.length)
//	    {
//	        System.out.println(Arrays.toString(arr));
//	        return;
//	    }
//	    for (int j = i; j < arr.length; j++)
//	    {
//	        swap(arr, i, j); 
//	        permute(arr, i + 1);  // recurse call
//	        swap(arr, i, j);      // backtracking
//	    }
//	} 
	

	// Folgende Hilfsmethode ist wahrscheinlich nützlich
	/**
	 * Vertauscht zwei Elemente eines Arrays.
	 * @param array
	 * @param index1
	 * @param index2
	 */
	static void swap(int[] array, int index1, int index2)
	{
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
	
}
