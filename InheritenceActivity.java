package OOps.polymorphism;
//super/parent/base class
class Employees
{
int employeeId;
String employeeName, employeeAdd;
long phNo;
double basicSalary, specialAllowance=250.80, Hra=1000.50;

//Constructor to initialize id, name, address, phone number,basic salary
 public Employees(int employeeId,String employeeName, String employeeAdd,long phNo,double basicSalary )
{
this.employeeId=employeeId;
this.employeeName=employeeName;
this.employeeAdd=employeeAdd;
this.phNo=phNo;
this.basicSalary=basicSalary;
}
 //calculating the transport allowance
public void CalTransportAllowance()
{
double ta;
ta=0.1*basicSalary;
System.out.println("The Transport Allowance is: "+ta);
}
//calculating gross salary
public void CalculateSal()
{
double salary;


salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
System.out.println("The salary is :"+salary);
}
 
}// End of Employee class
//child 1

class Manager extends Employees
{
	//reuse base class constructor
public Manager(int employeeId, String employeeName, String employeeAdd, long phNo,double basicSalary) {
super(employeeId, employeeName, employeeAdd, phNo, basicSalary);//reuse parent class constructor
}
//overriding super class
public void CalTransportAllowance()
{
double ta;
ta=15*basicSalary/100;

System.out.println("The Tranport Allowance  is :"+ta);
}

	
}//end of Manager class

//child 2
class Trainee extends Employees
{
//reuse base class constructor
public Trainee(int employeeId, String employeeName, String employeeAdd, long phNo, double basicSalary) {
super(employeeId, employeeName, employeeAdd, phNo, basicSalary);//invoke parent class constructor
		
}// end of Trainee class
	
}
public class InheritenceActivity {
public static void main(String[] args) 
{
Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
System.out.println(manager.employeeId + " "+ manager.employeeName+ " "+ manager.employeeAdd + " "+
manager.phNo+ " "+ manager.basicSalary);
manager.CalTransportAllowance();
manager.CalculateSal();
Trainee trainee= new Trainee(29846, "Jack", "Mumbai india", 442085, 45000);
System.out.println(trainee.employeeId+ " "+ trainee.employeeName + " "+ trainee.employeeAdd +" "+
trainee.phNo+" "+ trainee.basicSalary);
trainee.CalTransportAllowance();
trainee.CalculateSal();


		

}

}
