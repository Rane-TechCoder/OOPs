package myproject;

class temp_file {	
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]) {
	//selection sort
		int arr[]={7,8,3,1,2};
		for(int i=0;i<arr.length;i++){
			int small=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[small]) {
					small=j;
				}
			}
			
			//swap
			int temp=arr[small];
			arr[small]=arr[i];
			arr[i]=temp;
		}
		printArr(arr);
	}
}
