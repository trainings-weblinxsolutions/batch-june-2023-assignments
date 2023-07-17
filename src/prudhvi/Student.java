package prudhvi;

class StudentDemo
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.age = 20;
        s1.noOfFriends = 5;
        Student s2 = new Student();
        s2.age = 25;
        s2.noOfFriends = 6;
        Student s3 = new Student();
        s3.age = 24;
        s3.noOfFriends = 8;
        Student s4 = new Student();
        s4.age = 28;
        s4.noOfFriends = 3;
        Student s5 = new Student();
        s5.age = 27;
        s5.noOfFriends = 9;
        int TotalFriends = s1.noOfFriends+s2.noOfFriends+s3.noOfFriends+s4.noOfFriends+s5.noOfFriends;
        System.out.println(TotalFriends);
    }
}
class Student
{
int age,noOfFriends;
int sum()
{
return noOfFriends;
}
}
