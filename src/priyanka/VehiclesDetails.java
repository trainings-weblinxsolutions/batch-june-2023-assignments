package vehicles;

public class VehiclesDetails {

	public static void main(String[] args) {
		Car b1= new Car();
		b1.Tyres=4;
		b1.SeatingCapacity=5;
		b1.Color="blue";
		b1.Fueltype="petrol";
		b1.Doors=4;
		b1.vehicletype="volkswagon";
		b1.print();
		Bicycle b2= new Bicycle();
		b2.Tyres=2;
		b2.SeatingCapacity=2;
		b2.Color="Red";
		b2.Fueltype="petrol";
		b2.sideStand= true;
		b2.print();


		}
		}
		class Vehicle{
		int Tyres;
		int SeatingCapacity;
		String Color;
		String Fueltype;
		void vehiclePrint(){
		System.out.println("no of tyres:" +Tyres);
		System.out.println("how many people can seat:" +SeatingCapacity);
		
		System.out.println("color of vehicle:" +Color);
		System.out.println("Fuel consumes:" +Fueltype);

		}
		}
		class Car extends Vehicle{

		int Doors;
		String vehicletype;
		void print(){
		vehiclePrint();
		System.out.println("no of doors:" +Doors);
		System.out.println("Type of the vehicle:" +vehicletype);

		}


		}
		class Bicycle extends Vehicle{
		boolean sideStand;
		void print(){
		vehiclePrint();
		System.out.println("It has a stand" +sideStand );
		// TODO Auto-generated method stub

	}

}
