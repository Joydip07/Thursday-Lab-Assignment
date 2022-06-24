package OOps.inheritence;
//interface
interface LibraryUser
{
//abstract method
void registerAccount();
void requestBook();
}// end of library user interface

//Child 1
class KidUsers implements LibraryUser
{
//Declaring instance variable
private int age;
private String bookType;
	
//Constructor  
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
}//end of registeraccount()

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
		
}//end of requestbook()
	
}// end of kid user class

//Child 2

class AdultUser implements LibraryUser
{
//Declaring instance variable
private int age;
private String bookType;
	

//Constructor
public AdultUser(int age, String bookType) {
	
this.age = age;
this.bookType = bookType;
}//end of constructor


@Override
public void registerAccount()
{
		
if (age>12)
{
System.out.println("You have succesfully registered as an Adult Account");
}
else
{
System.out.println("Sorry Age must be greater than 12 to register as an adult");
}
			
}//end of registeraccount()

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
}// end of requestbook()
	
}//end oF ADULT USER class

public class LibraryInterface {

public static void main(String[] args) //Main Mthod
{
//invoking Method
KidUsers ku= new KidUsers(10, "Kids");
ku.registerAccount();
ku.requestBook();
//Invoking Method
AdultUser adu= new AdultUser(20, "Fiction");
adu.registerAccount();
adu.requestBook();
}

}
