class EmployeeData {
  public static void main(String args[]) {
Employee emp1=new Employee(1, 26, 1000, 27);
Employee emp2=new Employee(2, 39, 1250, 25);
Employee emp3=new Employee(3, 41, 1100, 29);
Employee emp4=new Employee(4, 53, 1050, 26);
Employee emp5=new Employee(5, 62, 1150, 24);





Employee employees[]={emp1,emp2,emp3,emp4,emp5};
Employee max=employees[0];

for(int i=0;i<employees.length;i++){
int currentMonthlySalary = employees[i].monthlySalary();
  System.out.println("Salary of Employee"+(i+1) +":"   +currentMonthlySalary);

if(currentMonthlySalary>max.monthlySalary()){
max=employees[i];
}

}
System.out.println("Employee with maximumSalary:"+max.id );





}
}
class Employee{
int id;
int age;
int salaryPerDay;
int noOfDays;

Employee(int id, int a, int perDay, int noOfDays){
this.id=id;
this.age=a;
this.salaryPerDay=perDay;
this.noOfDays=noOfDays;
}

int monthlySalary(){


if(age>60){
return (salaryPerDay+200)*noOfDays;
}
else if(age>40)
{
return (salaryPerDay+100)*noOfDays;

}
return salaryPerDay*noOfDays;
}


}