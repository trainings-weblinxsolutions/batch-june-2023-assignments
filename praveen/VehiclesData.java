public class VehiclesData {
	public static void main(String[] args) {

Car c1= new Car();
c1.tyres=4;
c1.seatingCapacity=5;
c1.engineHp=500;
c1.color="blue";
c1.fueltype="petrol";
c1.noOfDoors=4;
c1.vehicletype="Sedan";
c1.print();
MotorCycle c2= new MotorCycle();
c2.tyres=2;
c2.seatingCapacity=2;
c2.engineHp=120;
c2.color="black";
c2.fueltype="petrol";
c2.sideStand= true;
c2.print();


}
}
class Vehicle{
int tyres;
int seatingCapacity;
int engineHp;
String color;
String fueltype;
void vehiclePrint(){
System.out.println("no of tyres:" +tyres);
System.out.println("how many people can seat:" +seatingCapacity);
System.out.println("Horse power of Engine:" +engineHp);
System.out.println("color of th vehicle:" +color);
System.out.println("Fuel consumes:" +fueltype);

}
}
class Car extends Vehicle{

int noOfDoors;
String vehicletype;
void print(){
vehiclePrint();
System.out.println("no of doors:" +noOfDoors);
System.out.println("Type of the vehicle:" +vehicletype);

}


}
class MotorCycle extends Vehicle{
boolean sideStand;
void print(){
vehiclePrint();
System.out.println("Does it have a side stand" +sideStand);

}



}