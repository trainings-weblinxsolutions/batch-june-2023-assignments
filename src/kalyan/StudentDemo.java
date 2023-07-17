package kalyan;

class student
{
int age,noOfFriends;
int sum()
{
return noOfFriends;
}
}
class StudentDemo 
{
public static void main(String args[]) 
{
student s1 = new student();
s1.age = 20;
s1.noOfFriends = 5;
student s2 = new student();
s2.age = 25;
s2.noOfFriends = 6;
student s3 = new student();
s3.age = 24;
s3.noOfFriends = 8;
student s4 = new student();
s4.age = 28;
s4.noOfFriends = 3;
student s5 = new student();
s5.age = 27;
s5.noOfFriends = 9;
int totalFriends = s1.noOfFriends+s2.noOfFriends+s3.noOfFriends+s4.noOfFriends+s5.noOfFriends;
System.out.println(totalFriends);
} 
}
