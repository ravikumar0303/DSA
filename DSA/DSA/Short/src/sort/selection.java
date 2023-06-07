package sort;

public class selection {
	
	
	public static void PrintFunn(int []arr)
	{
		for(int i=0;i<arr.length-1;i++) {
			
	
	  System.out.println(arr[i]);
		}
	}

	
	public static void main(String [] args) {
		
		int [] arr= {9,13,25,5,6,32,1,4,8,7};
		
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
			
		}
		
		
		     PrintFunn(arr);
		   }
	                                        
	                                        
	                                        
}

