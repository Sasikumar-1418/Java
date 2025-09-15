package task.index;

class Vehicle //Base Class
{
	String Brand;
	int Price;
	
	void displayinfo(String name,int num) {
		this.Brand = name;
		this.Price = num;   //Assigning the values
		System.out.println("Brand: "+Brand+" , "+"Price: "+ Price);
	}
}

class Car extends Vehicle{
	int numberofdoors;
	
	void showcardetails(int num ) {
		this.numberofdoors =  num;
		
		System.out.println("Number of doors: "+ numberofdoors+"\n");
	}
}

class Bike extends Vehicle{
	boolean hasgear;
	
	void showbikedetails(boolean x) {
		this.hasgear = x;
		System.out.println("Has Gear: "+ hasgear+"\n");
	}
}

class Truck extends Vehicle{
	double loadcapacity;
	
	void showtruckdetails(double num) {
		this.loadcapacity = num;
		System.out.println("Load Capacity: "+loadcapacity+"\n");
	}
	
}
public class HierarchialinheritancePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cr = new Car();
		cr.displayinfo("Mercedes Benz",10000000);
		cr.showcardetails(4);
		
		Bike bk =  new Bike();
		bk.displayinfo("Pulsar-Ns200",175000);
		bk.showbikedetails(true);
		
		Truck tk = new Truck();
		tk.displayinfo("Tata",3000000);
		tk.showtruckdetails(10000);
	}

}
