package myproject;

//import java.util.Scanner;

class temp_file {	
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]) {
	//Bubble sort
		int arr[]={7,8,3,9,2};
		for(int i=0;i<arr.length-1;i++){
			
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1] && arr.length>j-1) {
				//swap
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		printArr(arr);
	}

}
