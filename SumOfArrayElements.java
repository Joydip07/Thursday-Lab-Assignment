package arrayexamples;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int size,i,arr[],sum=0;
		Scanner sc = new Scanner (System.in);
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

		for(i=0;i<size;i++)
		{
			sum=sum +arr[i];
		}
		System.out.println("The sum of array elements is" + " " +sum);
		
		

	}

}
