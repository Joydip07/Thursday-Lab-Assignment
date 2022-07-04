package arrayexamples;

import java.util.Scanner;

public class FindMInMaxElement {

	public static void main(String[] args) {
		int size,i,arr[];
		Scanner sc= new Scanner(System.in);
		//receive size of an array from user
        System.out.println("Enter size of an array");
        size=sc.nextInt();
        //instantiate array
        arr=new int[size];
        //getting array elements from user
       System.out.println("Enter "+size+ " "+ "elements in an array");
       for(i=0;i<arr.length;i++)
       {
    	 arr[i]= sc.nextInt();
       }

		
        
        //initialize min
        int min = arr[0];
        //initialize max
        int max = arr[0];

     //loop for minimum
        for( i=0;i<arr.length;i++)
        {
        	if(arr[i]<min)
        	{
        	min=arr[i];

        	}

        	}
    	System.out.println("Smallest element presnt in array is:" +min);        

        //loop for maximum
        for ( i=0;i<arr.length;i++)
        {
        	if(arr[i]>max)
        	{
        		max=arr[i];

        	}



        }
    	System.out.println("Greatest element present in array is:"+max);


	}

}
