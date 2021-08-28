package com.vikrant.essentials.arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,4,5};
		printArr(arr);
		// bubbleSort(arr);
		// selectionSort(arr);
		// insertionSort(arr);
		// shellSort(arr);
//		 mergeSort(arr, 0, arr.length - 1);
		quickSort(arr, 0, arr.length - 1);
		printArr(arr);

	}

	public static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = arr.length - 1; j >= i; j--) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int elem = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > elem) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = elem;
		}
	}

	public static void shellSort(int[] arr) {
		int d = arr.length / 2;
		while (d > 0) {
			for (int i = d; i < arr.length; i++) {
				int elem = arr[i];
				int j = i - d;
				while (j >= 0 && arr[j] > elem) {
					arr[j + d] = arr[j];
					j = j - d;
				}
				arr[j + d] = elem;
			}
			d = d / 2;
		}
	}

	// int[] arr = { 9, 3, 7, 1, 5, 4 };
	public static void mergeSort(int[] arr, int start, int end) {
		if (end > start) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		int i = start;
		int j = mid+1;
		int k = 0;
		int[] arr1 = new int[end - start + 1];
		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j]) {
				arr1[k] = arr[i];
				i++;
				k++;
			}
			else  {
				arr1[k] = arr[j];
				j++;
				k++;
			}
		}
		while (i <= mid) {
			arr1[k] = arr[i];
			i++;
			k++;
		}
		while (j <= end) {
			arr1[k] = arr[j];
			j++;
			k++;
		}
		k = 0;
		for (int x = start; x <= end; x++) {
			arr[x] = arr1[k++];
		}
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot - 1);
			quickSort(arr, pivot + 1, end);
		}
	}

	public static int partition(int[] arr, int start, int end) {
		int elem = arr[start];
		int left = start;
		int right = end;
		while (left < right) {
			while (left < arr.length && arr[left] <= elem) {
				left++;
			}
			while (right >= 0 && arr[right] > elem) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		arr[start] = arr[right];
		arr[right] = elem;
		return right;
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i == arr.length - 1) {
				System.out.println();
			}
		}
	}

}
