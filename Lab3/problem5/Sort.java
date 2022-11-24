package problem5;

public class Sort {
	static <E> void swap(E [] array, int i, int j) {
		E o1 = array[i];
		array[i] = array[j];
		array[j] = o1;
	}

	static <E extends Comparable<E>> void bubbleSort(E [] array) {
		int i, j;
		int n = array.length;
		boolean ok;
		for (i = 0; i < n-1; i++){
			ok = false;
			for (j = 0; j < n-i-1; j++){
				if (array[j].compareTo(array[j+1]) == -1){
					swap(array, j, j+1);
					ok = true;
				}
			}
			if (ok == false) break;
		}
		
	}

	static <E extends Comparable<E>> void quickSort(E [] array, int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}

	static <E extends Comparable<E>> int partition(E [] array, int low, int high) {
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (array[high].compareTo(array[j]) == -1) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, high);
		return (i + 1);
	}

}

