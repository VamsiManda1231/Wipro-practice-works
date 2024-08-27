
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//encapsulating all the values
			Employee e =new Employee("Abhi",500000,"14-10-2020","A123D004E");

			System.out.println("Name: "+e.getName());
			System.out.println("Annual Salary: "+e.getSalary());
			System.out.println("Hire Date: "+e.getDate());
			System.out.println("Insurance number: "+e.getInsurance());
	}

}
