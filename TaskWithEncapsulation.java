package task.index;

public class TaskWithEncapsulation {

    // Encapsulated class
    static class Student {
        // private variables
        private String name;
        private int rollNumber;
        private int mark;

        // getter & setter for name
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        // getter & setter for rollNumber
        public int getRollNumber() {
            return rollNumber;
        }
        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        // getter & setter for mark
        public int getMark() {
            return mark;
        }
        public void setMark(int mark) {
            this.mark = mark;
        }
    }
    
    static class employee{
    	private int emplid;
    	private String name;
    	private double salary;
    	
    	// emplid get and set
    	public int getEmplid() {
    		return emplid;
    	}
    	
    	public void setEmplid(int empid) {
    		this.emplid = empid;
    	}
    	
    	// name get and set
    	public String getName() {
    		return name;
    	}
    	
    	public void setName(String newname) {
    		this.name = newname;
    	}
    	
    	// salary get and set
    	public double getSalary() {
    		return salary;
    	}
    	
    	public void setSalary(double newsalary) {
    		this.salary = newsalary;
    	}
    }

    public static void main(String[] args) {
        // Creating Student object
        Student obj = new Student();
        obj.setName("Sasikumar");
        obj.setRollNumber(101);
        obj.setMark(90);

        // Accessing through getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Roll No: " + obj.getRollNumber());
        System.out.println("Mark: " + obj.getMark());
        
        System.out.print("\n");
        
        employee obj1 = new employee();
        obj1.setEmplid(1001);
        obj1.setName("Sivakumar");
        obj1.setSalary(450000);
        
        System.out.println("employee id: " + obj1.getEmplid());
        System.out.println("Empoyee name: " + obj1.getName());
        System.out.println("Employee Salary: " + obj1.getSalary());
    }
}
