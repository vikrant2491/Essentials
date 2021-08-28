package com.vikrant.java.essentials.hackerrank.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankFraud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		
		System.out.println(activityNotifications(arr, 4));

	}
	public static int activityNotifications(List<Integer> expenditure, int d) {
	    // Write your code here
	    int count = 0;
	    if(expenditure.size()<=d){
	        return 0;
	    }
	    sort(expenditure, 0, d-1);
	    
	    for(int a = d;a<expenditure.size();a++){
	    	double median;
	    	if(d%2==1)
	    		median = expenditure.get((2*a-d)/2);
	    	else
	    		median = (double)((expenditure.get((2*a-d)/2) + expenditure.get(((2*a-d)/2)-1)))/2;
	    	System.out.println(median);
	    	if(expenditure.get(a)>=median*2)
	    		count++;
	    	
	    	sort(expenditure, a-d, a);

	    }
	    return count;
	    }
	    
	    
	    
	    public static void merge(List<Integer> arr, int l, int m, int r)
	    {
	        // Find sizes of two subarrays to be merged
	        int n1 = m - l + 1;
	        int n2 = r - m;
	 
	        /* Create temp arrays */
	        List<Integer> L = new ArrayList<>();
	        List<Integer> R = new ArrayList<>();
	        
	 
	        /*Copy data to temp arrays*/
	        for (int i = 0; i < n1; ++i)
	        	L.set(i, arr.get(l + i));
	        for (int j = 0; j < n2; ++j)
	        	R.set(j, arr.get(m + 1 + j));
	 
	        /* Merge the temp arrays */
	 
	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;
	 
	        // Initial index of merged subarry array
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L.get(i) <= L.get(j)) {
	            	arr.set(k, L.get(i));
	                i++;
	            }
	            else {
	            	arr.set(k, R.get(j));
	                j++;
	            }
	            k++;
	        }
	 
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) {
	        	arr.set(k, L.get(i));
	            i++;
	            k++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) {
	        	arr.set(k, R.get(j));
	            j++;
	            k++;
	        }
	    }
	 
	    // Main function that sorts arr[l..r] using
	    // merge()
	   public static void sort(List<Integer> arr, int l, int r)
	    {
	        if (l < r) {
	            // Find the middle point
	            int m =l+ (r-l)/2;
	 
	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	 
	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }
	   
	   public static void iSort(List<Integer> list, int i, int j){
	    	for(int gap=((j-i)+1)/2;gap>0;gap /=2){
	    		for(int x=gap;x<=j;x++){
	    			int elem = list.get(x);
	    			int y = x;
	    			while(y>=i+gap && list.get(y-gap)>elem){
	    				list.set(y, list.get(y-gap));
	    				y -= gap;
	    			}
	    			list.set(y, elem);
	    		}	    		
	    	}
	    	System.out.println(list);
	    	
	    }
	    
	    public static void insertInOrder(List<Integer> list, int j){
	    	int elem = list.get(j);
	    	int i = j-1;
	    	while(i>=0 && list.get(i)>elem){	    		
	    		list.set(i+1, list.get(i));	
	    		i--;
	    	}
	    	list.set(i, list.get(j));
	    	
	    }
	    

}
