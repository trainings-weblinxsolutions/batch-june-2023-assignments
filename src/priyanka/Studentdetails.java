package priyanka;
public class Studentdetails {
	int age;
	int numofFrnds;

	public static void main(String[] args) {
		
		Studentdetails stu1 = new Studentdetails();
		
		Studentdetails stu2 = new Studentdetails();
		
		Studentdetails stu3 = new Studentdetails();
		
		Studentdetails stu4 = new Studentdetails();
		
		Studentdetails stu5 = new Studentdetails();
		
		stu1.age=16;
		stu1.numofFrnds =3;
		
		stu2.age=17;
		stu2.numofFrnds =4;
		
		stu3.age=16;
		stu3.numofFrnds =6;
		
		stu4.age=18;
		stu4.numofFrnds =7;
		
		stu5.age=20;
		stu5.numofFrnds =8;
		int sumofFriends = stu1.getNumofFrnds() + stu2.getNumofFrnds()+ stu3.getNumofFrnds()+stu4.getNumofFrnds()+ stu5.getNumofFrnds();
	    System.out.println("Sum of numofFrnds is:"+ sumofFriends);
	}
	
	public int getNumofFrnds() {
		return numofFrnds;
	}
}
		
		
		
		