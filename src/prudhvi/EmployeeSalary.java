package prudhvi;

class EmployeeSalary
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(1,26, 1000, 27);
        Employee e2 = new Employee(2,39, 1250, 25);
        Employee e3 = new Employee(3,41, 1100, 29);
        Employee e4 = new Employee(4,53, 1050, 26);
        Employee e5 = new Employee(5,62, 1150, 24);

        Employee employees[] = {e1,e2,e3,e4,e5};

        Employee max = employees[0];

        for(int i=0; i <employees.length ;i++)
        {
            int currentMonthlySalary = employees[i].monthlySalary();
            System.out.println("Salary of e" + (i+1) + " is "+currentMonthlySalary);
            if(currentMonthlySalary > max.monthlySalary()) {
                max = employees[i];
            }
        }
        System.out.println("Employee with max salary is : "+max.id);
    }

}


class Employee
{
    int id;
    int age;
    int salaryPerDay;
    int noOfDaysWorking;

    public Employee(int id, int age, int salaryPerDay, int noOfDaysWorking) {
        this.id=id;
        this.age = age;
        this.salaryPerDay = salaryPerDay;
        this.noOfDaysWorking = noOfDaysWorking;
    }

    int monthlySalary()
    {

        int monthlySalary=0;

        if(age > 60) {

            monthlySalary =  (salaryPerDay+200)*noOfDaysWorking;
        }
        else if(age > 40) {
            monthlySalary =  (salaryPerDay+100)*noOfDaysWorking;
        }
        else
            monthlySalary =  salaryPerDay*noOfDaysWorking;

        return monthlySalary;

    }
}