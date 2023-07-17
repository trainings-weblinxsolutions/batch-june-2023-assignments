package kalyan;

class Employee
{
int age, salaryPerDay, noOfWorkingDays;

Employee(int age, int salaryPerDay, int noOfWorkingDays)
{
this.age = age;
this.salaryPerDay  = salaryPerDay;
this.noOfWorkingDays = noOfWorkingDays;
}
int monSal()
{
if(age <= 40)
{
return salaryPerDay * noOfWorkingDays;
}
if(age > 40 && age <=60)
{
return (salaryPerDay+100) * noOfWorkingDays;
}
if(age > 60)
{
return (salaryPerDay+200) * noOfWorkingDays;
}
return 0;
}
}
public class EmployeeSalary
{
public static void main(String args[])
{
Employee employee1 = new Employee(26,1000,27);
Employee employee2 = new Employee(39,1250,25);
Employee employee3 = new Employee(41,1100,29);
Employee employee4 = new Employee(53,1050,26);
Employee employee5 = new Employee(62,1150,24);

System.out.println("Salary of Employee1 =" +employee1.monSal());
System.out.println("Salary of Employee2 =" +employee2.monSal());
System.out.println("Salary of Employee3 =" +employee3.monSal());
System.out.println("Salary of Employee4 =" +employee4.monSal());
System.out.println("Salary of Employee5 =" +employee5.monSal());

int salary[] = {employee1.monSal(), employee2.monSal(), employee3.monSal(), employee4.monSal(), employee5.monSal()};

int maxSalary = 0;

for(int i = 0; i<salary.length; i++)
{
//int j=0;
//j = j+1;
//System.out.println("Salary of Employee" +j +"=" +salary[i]);
if(salary[i]>maxSalary)
{
maxSalary = salary[i];
}
}
System.out.println("Employee with maximum salary =" +maxSalary);
}
}
