class EmployeeData {
  public static void main(String args[]) {
Employee emp1=new Employee(26, 1000, 27);
Employee emp2=new Employee(39, 1250, 25);
Employee emp3=new Employee(41, 1100, 29);
Employee emp4=new Employee(53, 1050, 26);
Employee emp5=new Employee(62, 1150, 24);
System.out.println("Salary of Employee1:" +emp1.compute());
System.out.println("Salary of Employee2:" +emp2.compute());
System.out.println("Salary of Employee3:" +emp3.compute());
System.out.println("Salary of Employee4:" +emp4.compute());
System.out.println("Salary of Employee5:" +emp5.compute());




int salary[]={emp1.compute(),emp2.compute(),emp3.compute(),emp4.compute(),emp5.compute()};
int maximumSalary=emp1.compute();

for(int i=1;i<salary.length;i++){

if(salary[i]>maximumSalary)
maximumSalary=salary[i];

}
System.out.println("Employee with maximumSalary:"+maximumSalary );





}
}
class Employee{
int age;
int salaryPerDay;
int noOfDays;
int monthlySalary;
Employee(int a, int perDay, int noOfDays){
this.age=a;
this.salaryPerDay=perDay;
this.noOfDays=noOfDays;
}

int compute(){


if(age>40){
return monthlySalary=(salaryPerDay+100)*noOfDays;
}
else if(age>60)
{
return monthlySalary=(salaryPerDay+200)*noOfDays;

}
return monthlySalary=salaryPerDay*noOfDays;
}


}