package sravani;
public class Student {

	int age;
	int numOfFrnds;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();

		Student s2 = new Student();

		Student s3 = new Student();

		Student s4 = new Student();

		Student s5 = new Student();

		Student s6 = new Student();

		s1.age = 23;
		s1.numOfFrnds = 4;

		s2.age = 24;
		s2.numOfFrnds = 5;

		s3.age = 25;
		s3.numOfFrnds = 6;

		s4.age = 26;
		s4.numOfFrnds = 7;

		s5.age = 27;
		s5.numOfFrnds = 8;

		s6.age = 28;
		s6.numOfFrnds = 9;

		int sumOfFriends = s1.getNumOfFrnds() + s2.getNumOfFrnds() + s3.getNumOfFrnds() + s4.getNumOfFrnds()
				+ s5.getNumOfFrnds() + s6.getNumOfFrnds();
		System.out.println("The sum of numOfFrnds is: " + sumOfFriends);
	}

	public int getNumOfFrnds() {
		return numOfFrnds;

	}

}
