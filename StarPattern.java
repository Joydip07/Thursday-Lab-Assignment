package OOps;


public class StarPattern {
	public static void main (String[] args) {
		int i,j,k;// i for row,j for space,k for stars
		for(i=1; i<=9; i=i+2)//row
		{
			for(j=9; j>=i; j--)//j>=i=>9>1 condition true
			{
				System.out.print(" ");
				
			}
			for(k=1; k<=i; k++)// k<=i=>1=1 condition true
			{
				System.out.print("* ");
			}
			System.out.println();// new line for next row
		}
	}
}




