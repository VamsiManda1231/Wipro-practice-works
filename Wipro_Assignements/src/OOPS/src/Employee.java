
public class Employee extends Person {
	private double annual_salary;
	private String hire_date;
	private String insurance_num;
	//constructing for employee class
	public Employee(String name,double annual_salary,String hire_date,String insurance_num) {
		// TODO Auto-generated constructor stub
		super(name);
		this.annual_salary=annual_salary;
		this.hire_date=hire_date;
		this.insurance_num=insurance_num;
	}
	//use of setters and getters
	public double getSalary( ) {
		return annual_salary;
	}
	void setSalary(double annual_salary) {
		this.annual_salary=annual_salary;
	}
	public String getDate() {
		return hire_date;
	}
	void setDate(String hire_date) {
		this.hire_date=hire_date;
	}
	public String getInsurance() {
		return insurance_num;
	}
	void setInsurance(String insurance_num) {
		this.insurance_num=insurance_num;
	}


}
