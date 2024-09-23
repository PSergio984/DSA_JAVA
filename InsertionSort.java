public class InsertionSort{
	
	// Insertion sort = after comparing elements to the left,
	//				shift elements to the right to make room to insert a value, SO
	
	//				Quadratic time O(n^2)
	//				small data set = decent
	//				large data set = BAD
	
	//				Less steps than Bubble sort
	//				Best case is O(n) compared to Selection sort O(n^2)
	
	public static void main(String[] args) {
		
		int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};
		
        System.out.print(("Before Sorting: "));
        
		for(int i : array) {
		    
			System.out.print(i + " ");
		}
			
			insertionSort(array);
			
			System.out.print(("\nAfter Sorting:  "));
			for(int i : array) {
			System.out.print(i + " ");
		}
	}
    
    
	private static void insertionSort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {
			int temp = array[i]; //TEMPORARY STORING THE CURRENT INDEX
			int j = i - 1; //GETTING THE VALUES OF THE ARRAYS TO THE LEFT OF THE CURRENT INDEX
			
			while(j >= 0 && array[j] > temp) { //IF THE ELEMENT ON THE LEFT IS BIGGER THAN THE CURRENT  ARRAY
				array[j + 1] = array[j]; //SHIFT ELEMENT TO THE RIGHT
				j--;
				/*
				CONTINUE SWITCHING VALUES FROM THE LEFT TO THE RIGHT UNTIL IT REACHES THE 
				LAST ELEMENT OR AND THE VALUE TO THE LEFT IS LARGER TO THE CURRENT VALUE*/
			} // if everything on the left is smaller, put it now on the opening
			array[j + 1] = temp;//INSERT THE ORIGINAL ELEMENT TO THE OPENING
		}
	}
}

