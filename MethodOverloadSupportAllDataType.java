package task.index;

public class MethodOverloadSupportAllDataType {
	
	public void print(String name,int num, double value){
		System.out.println("Printing the String: "+name);
		System.out.println("Printing the integer: "+num);
		System.out.println("Printing the double: "+value);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadSupportAllDataType p = new MethodOverloadSupportAllDataType();
		
		p.print("Sasi", 100, 500);
	}

}
