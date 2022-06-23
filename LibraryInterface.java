package OOps.inheritence;



//interface
interface LibraryUser
{
	void registerAccount();
	void requestBook();
}// end of library user interface
class KidUsers implements LibraryUser
{
	int age;
	String bookType;
	

    
	public KidUsers(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
		
	

	@Override
	public void registerAccount() {
		if (age<12)
		{
			System.out.println("You have succesfully registered under kids account");
		}
		else
		{
			System.out.println("Sorry,age must be less than 12 to register as a kid");
		}
		
		
		
	}

	@Override
	public void requestBook() {
		if (bookType=="Kids") 
		{
			System.out.println("Book issued successfully");
			System.out.println("Please return the book within 10 days");
		}
		else
		{
			System.out.println("oops,you are allowed to take only kids book");
		}
	
		
		
	}

	
	
}// end of kid user class

class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	


	public AdultUser(int age, String bookType) {
	
		this.age = age;
		this.bookType = bookType;
	}


	@Override
	public void registerAccount() {
		
		
		 
		if (age>12)
		{
			System.out.println("You have succesfully registered as an Adult Account");
		}
		else
		{
			System.out.println("Sorry Age must be greater than 12 to register as an adult");
		}
			
	}

	@Override
	public void requestBook() 
	{



		if (bookType=="Fiction")
		{
			System.out.println("Book Issued successfully,please return the book within 7 days");
			
		}
		else
		{
			System.out.println("Oops you arfe allowed to take only adult Fiction books");
		}

		
		
	}
	
}//end oF ADULT USER class

public class LibraryInterface {

	public static void main(String[] args) {
	KidUsers ku= new KidUsers(10, "Kids");
	ku.registerAccount();
    ku.requestBook();
    AdultUser adu= new AdultUser(20, "Fiction");
    adu.registerAccount();
    adu.requestBook();
	}

}
