package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort {///////////////////////////////////////////////////////////////////
  public static void main(String[] args) throws IOException{
 	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	 //create an int type array
 	 System.out.println("how many elemnt");
 	 int n=Integer.parseInt(br.readLine());
 	 int arr[]=new int[n];
 			//accept integer element into the arry
 	 for(int i=0;i<n;i++){
 		 System.out.println("enter int:");
 		 arr[i]=Integer.parseInt(br.readLine());
 		 
 	 }
 	 //use bubble sort technique to sort the integer
 	 int limit=n-1;
 	 //element from 0 to n-1
 	 boolean flag=false;
 	 //temprory verible
 	 int temp;
 	 
 	 for(int i=0;i<limit;i++){
 		 for(int j=0;j<limit-1;j++){
 			 //if first element is bigger then second
 			 if(arr[j]>arr[j+1]){
 				 temp=arr[j];
 				 arr[j]=arr[j+1];
 				 arr[j+1]=temp;
 				 flag=true;
 				 //true->swapping done
 			 }
 		 
 		 }//no swapping,so come out
 		  if(flag==false)
 			  break;
 		 else 
 			 flag=false;
 		//display the sorted arry
 		  System.out.println("the sorted array is");
 		  for(int i1=0;i1<n;i1++){
 			  System.out.println(arr[i1]);
 		  }
 	 }
	
} 
}
