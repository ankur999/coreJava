package coreJavaBasics;

import java.util.ArrayList;

public class AmazonIntQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print only unique no and how many times no repeated in this array
		int[] arr= {4,4,5,5,6,7,6,4,7,5,9};
		
		//Algo->first create an empty array then push one element if element is present we 
		//will scan the array to check if same element is there or not if it is there we 
		//will inc the count 
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//loop through arrays
		for(int i=0;i<arr.length;i++) {
			
			int k=0;
			
			//check if element is in the list or not
			
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
				k++;
				//after that scan the remaining list to check same element is there or not
				
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						k++;
					}
				}
				
				System.out.println("Number: " + arr[i]+ " Is coming: " +k+ " times");
				if(k==1) {
					System.out.println("Our unique no is: " +arr[i]);
				}
				
			}
		}
		
		
		

	}

}
