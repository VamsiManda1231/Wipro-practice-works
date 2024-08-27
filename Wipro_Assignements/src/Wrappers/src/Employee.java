public class Employee implements Cloneable {
	String name;
	int age;
	double Salary;
	Employee(String name,int age,double Salary){
		this.name=name;
		this.age=age;
		this.Salary=Salary;
	}
	public Object clone() throws CloneNotSupportedException	{
		return super.clone();
		
	}
	public String toString() {
		return "Employee Name"+name+" Age: "+age+" Salary: "+Salary;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee a =new Employee("Abhi",21,5000000);
			Employee b = (Employee) a.clone();
			a.name="arjun";
			a.age=23;
			a.Salary=600000;
			System.out.println("Original Employee is:"+a);
			System.out.println("The cloned employee is: "+b);
		
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			
		}
	}

}


/*class Employee implements Cloneable {
    private String name;
    private int age;
    private String department;

    // Constructor
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Override clone method to make a cloneable object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }

    public static void main(String[] args) {
        try {
            // Create an Employee object
            Employee originalEmployee = new Employee("John Doe", 30, "Engineering");

            // Clone the original Employee object
            Employee clonedEmployee = (Employee) originalEmployee.clone();

            // Change properties of the original Employee object
            originalEmployee.name = "Jane Smith";
            originalEmployee.age = 35;
            originalEmployee.department = "Marketing";

            // Print properties of both the original and cloned Employee objects
            System.out.println("Original Employee: " + originalEmployee);
            System.out.println("Cloned Employee: " + clonedEmployee);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
*/