package arrayexamples;

import java.util.Arrays;
import java.util.Scanner;

public class CheckEqualorNot {

	public static void main(String[] args) {
		int size ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of first array :");
		size = sc.nextInt();
		int a[]= new int[size];//first array
		System.out.println("Enter " +size+ " " + "Elements in an array" );
		for(int i=0; i<size; i++)
		{
		a[i]=sc.nextInt();
		}
		int size2 ;
		System.out.println("Enter size of second array : ");
		size2=sc.nextInt();
		int b[]= new int [size2];//second array
		System.out.println("Enter " +size2+ " " + "Elements in second array");
		for(int i=0; i<size2; i++)
		{
		b[i]=sc.nextInt();
		}
      //Condition Statement
      if(Arrays.equals(a, b))
      {
    	  System.out.println("Arrays are eqaul");
      }
      else
      {
    	  System.out.println("Arrays are not equal");
      }


	}

}
