package task.index;

class Person{
	String name;
	int age;
	
	void displayPersonInfo(String names, int num) {
		this.name = names;
		this.age = num;
		
		System.out.println("EmployeePersonInfo: "+"Name: "+name+" , "+"Age: "+age);
	}
}

class Employee extends Person{
	int id;
	String dept;
	
	void displayEmployeeInfo(int num, String deps) {
		this.id = num;
		this.dept = deps;
		
		System.out.println("EmployeeInfo: "+"Id: "+id+" , "+"Dept: "+dept);
		
	}
}

public class SingleInheritExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E = new Employee();
		E.displayPersonInfo("Sasikumar",25);
		E.displayEmployeeInfo(2236,"Colruyt");

	}

}
