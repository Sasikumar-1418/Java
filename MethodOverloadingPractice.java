package task.index;

public class MethodOverloadingPractice {
	
	// Overloading with 2 subjects
	public int calculateMarks(String studentName,int subject1, int subject2) {
		int total = subject1 + subject2;
		System.out.println("Student: " + studentName);
		return total;
	}
	
	// Overloading with 3 subjects
	public int calculateMarks(String studentName,int subject1, int subject2, int subject3) {
		int total = subject1 + subject2 + subject3;
		System.out.println("Student: " + studentName);
		return total;
	}
	
	// Overloading with array of doubles
	public double calculateMarks(String studentName,double[] Scored) {
		double total = 0;
		for(double mark : Scored) {
			total += mark;
		}
		System.out.println("Student: " + studentName);
		return total;
	}
	
	
	// Standard main method
	public static void main(String[] args) {
		MethodOverloadingPractice obj = new MethodOverloadingPractice();
		
		// First method
		System.out.println("Total Mark: " + obj.calculateMarks("Sasi",95, 91));
		
		// Second method
		System.out.println("Total Mark: " + obj.calculateMarks("Siva",95, 91, 100));
		
		// Third method with array
		double[] subjects = {70.5, 65.0, 90.5, 80.0};
		System.out.println("Total Mark: " + obj.calculateMarks("Vasavi",subjects));
		
	}
	
}
