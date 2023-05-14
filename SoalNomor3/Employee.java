package SoalNomor3;
public class Employee {
    private String firstName,lastName;
    private int id,salary;
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        if (percent < 0){
            System.out.println("nilai persentase tidak boleh bernilai negatif");
        }
        else {
            salary += salary * percent / 100;
        }
        return salary;
    }


    public String toString() {
        return "Employee[id= " + id + ", name= " + getName() + ", salary= " + salary + "]";
    }
}
