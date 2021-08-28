package com.vikrant.essentials.hackerrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notifications {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader(new File("input.txt")));
		String line;
		List<Integer> expenditure = new ArrayList<>();
		while((line=reader.readLine())!=null){
			String[] in = line.split(" ");
			for(int i=0;i<in.length;i++){
				expenditure.add(Integer.valueOf(in[i]));
			}			
		}
		
//		expenditure.add(10);
//		expenditure.add(20);
//		expenditure.add(30);
//		expenditure.add(40);
//		expenditure.add(50);
		System.out.println(activityNotifications(expenditure, 4));

	}
	
	
	
	public static int activityNotifications(List<Integer> expenditure, int d) {
        int res = 0;
        int count[] = new int[201];
        for(int i=0;i<d;i++){
            count[expenditure.get(i)]++;
        }
        
        for(int i=d;i<expenditure.size();i++){
            if(expenditure.get(i)>=2*getMedian(count, d)){
                res++;
            }
            count[expenditure.get(i)]++;
            count[expenditure.get(i-d)]--;
        }
        return res;
    }
    
    public static double getMedian(int[] list, int d){
        int sum = -1;
        int m1 = -1;
        int m2 = -1;
        double m=-1;
        for(int i=0;i<list.length;i++){
            sum += list[i];
            if(d%2==0){
                if(m1==-1 && sum>=d/2-1){
                    m1 = i;
                }
                if(m2==-1 && sum>=(d/2)){
                    m2 = i;
                    m= (double)(m1+m2)/2;
                    break;
                }                
            }else{                
                if(sum>=d/2){
                    m= i;
                    break;
                }
            }
        }
        return m;
    }
	
}
