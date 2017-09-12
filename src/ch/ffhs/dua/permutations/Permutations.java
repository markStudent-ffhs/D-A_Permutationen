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
		if(n == 0) {
			return new int[0][0];
		}
		int count = size(n);
		int[][] result = new int[count][n];
		int[] base = new int[n];
		for (int i = 0; i < n; i++) {
			base[i] = i;
		}
		permute(base,0,result,0);
		return result;
	}
	
	private static int permute(int[] array, int index, int[][] result,int count)
	{
		if(index >= array.length - 1){ 
			result[count] = array.clone();
			count++;
	        return count;
	    }
	    for(int i = index; i < array.length; i++){ 
	    	swap(array,index,i);
	        count = permute(array, index+1,result,count);
	        swap(array,index,i);
	    }
	    return count;
	}
	
	public static int size (int n) 
	{
		int count = 1;
		for (int i = 2; i <= n; i++) {
			count *= i;
		}
		return count;
	}
	

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
