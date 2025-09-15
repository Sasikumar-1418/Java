package task.index;

public class ConstructorTypesExample {
	
	String Name;
	int RollNumber;
	char Grade;
	
	public ConstructorTypesExample() //Default Constructor
	{
	System.out.println("Student Details: "+"Name: "+"Unknown"+","+"RollNumber: "+0+","+"Grade: "+"N/A");
	}
	
	public ConstructorTypesExample(String names, int num, char x)
	{
		this.Name = names;
		this.RollNumber = num;
		this.Grade = x;
		
		System.out.println("Student Details: "+"Name: "+Name+","+"RollNumber: "+RollNumber+","+"Grade: "+Grade);
	}
	
	//copy constructor if needed only we can create because java doesn't provide support for copy constructor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTypesExample ce = new ConstructorTypesExample(); //Directly calls default constructor
		ConstructorTypesExample cj = new ConstructorTypesExample("Sasikumar",2236,'A');
	}

}
