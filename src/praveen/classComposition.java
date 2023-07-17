package praveen;

public class classComposition{

	public static void main(String[] args) {
Retail ob=new Retail("Walmart");
ob.sectionId=new Bakery(23);
ob.noOfCounters=4;
ob.noOfEmployees=15;
ob.noOfManagers=1;
ob.aisleNoGrocery=new Grocery(2);
System.out.println(ob.aisleNoGrocery.aisleNoGrocery);
System.out.println(ob.sectionId.sectionId);

System.out.println(ob.name);
ob.eleAisleNo=new Electronics(1);
ob.eleAisleNo.tvMake="samsung";
System.out.println(ob.eleAisleNo.tvMake);
System.out.println(ob.eleAisleNo.eleAisleNo);




}}

class Retail{
String name;
Electronics eleAisleNo;
Grocery aisleNoGrocery;
Bakery sectionId;
int noOfCounters;
int noOfEmployees;
int noOfManagers;
Retail(String name){
this.name=name;
}
}

class Electronics{

int eleAisleNo;
String tvMake;
String washingMachineMake;
String refrigratorMake;
Electronics(int eleAisleNo){
this.eleAisleNo=eleAisleNo;
}

}

class Bakery{
int sectionId;
int pizzaCost;
int burgerCost;
int nuggetsCost;
Bakery(int sectionId){
this.sectionId=sectionId;

}
}
class Grocery{
int sugarCost;
int dryPastCost;
int coffeBeansCost;
int aisleNoGrocery;
Grocery(int aisleNoGrocery){
this.aisleNoGrocery=aisleNoGrocery;
}
}