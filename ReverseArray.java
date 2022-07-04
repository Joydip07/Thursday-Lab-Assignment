package arrayexamples;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int size,i,arr[];
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
       //REVERSE ARRAY
       System.out.println("Reverse of the array is:");
       for(i=arr.length-1;i>=0;i--)
       {
    	   System.out.println(arr[i]);
       }


	}

}
