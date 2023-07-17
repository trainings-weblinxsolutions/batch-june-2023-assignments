package pooja;
public class Student 
{
	 int age;
	 int noOfFriends;


	//creating a method for noOfFriends
	public int getNoOfFriends() 
	{
		return noOfFriends;
	}
	public static void main(String args[])
	{	
  // creating 5 objects for Students
     Student s1= new Student();
     s1.age=26;
     s1.noOfFriends=5;
     
     Student s2= new Student();
     s2.age=20;
     s2.noOfFriends=4;
  
     Student s3= new Student();
     s3.age=23;
     s2.noOfFriends=7;
     
     Student s4= new Student();
     s4.age=15;
     s4.noOfFriends=2;
  
     Student s5= new Student();
     s5.age=25;
     s5.noOfFriends=4;
     
     int noOfFriends = s1.getNoOfFriends()+s2.getNoOfFriends()+s3.getNoOfFriends()+s4.getNoOfFriends()+s5.getNoOfFriends();
     
     System.out.println("Sum of noOfFriends:"+ noOfFriends);
}
	
}


