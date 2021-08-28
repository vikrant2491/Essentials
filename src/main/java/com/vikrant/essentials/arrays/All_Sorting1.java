package com.vikrant.essentials.arrays;

public class All_Sorting1 implements Cloneable{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 7, 4, 9 };
		display(arr);
		// bubbleSort(arr);
		// selectionSort(arr);
		// insertionSort(arr);
		// shellSort(arr);
		// mergeSort(arr, 0, arr.length - 1);
		quickSort(arr, 0, arr.length - 1);
		display(arr);
		
//		All_Sorting1 a = new All_Sorting1();
//		a.clone();
//		a.equals(a);
//		a.finalize();
//		a.hashCode();
//		a.notify();
//		a.notifyAll();
//		a.toString();
//		a.wait();
		
	}

	public static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			int max = i;
			for (int j = 0; j < i; j++) {
				if (arr[max] < arr[j]) {
					max = j;
				}
			}
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
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

	public static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		int i = start, j = mid + 1, k = 0;
		int[] arr1 = new int[end - start + 1];
		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j]) {
				arr1[k++] = arr[i++];
			} else if (arr[i] > arr[j]) {
				arr1[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			arr1[k++] = arr[i++];
		}
		while (j <= end) {
			arr1[k++] = arr[j++];
		}
		k = 0;
		for (int x = start; x <= end; x++) {
			arr[x] = arr1[k++];
		}
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pivot = partition(arr, start, end);
			quickSort(arr, 0, pivot - 1);
			quickSort(arr, pivot + 1, end);
		}
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = start;
		int i = start, j = end;
		while (i < j) {
			while (arr[i] <= arr[pivot]) {
				i++;
			}
			while (arr[j] > arr[pivot]) {
				j--;
			}
			if (j > i) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[pivot];
		arr[pivot]=arr[j];
		arr[j]=temp;
		
		return j;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
