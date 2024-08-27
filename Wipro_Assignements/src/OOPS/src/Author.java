
public class Author {
	private String name;
	private String email;
	private char gender;
	//constructing author 
	public Author(String name,	String email, char gender) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	//using public getters
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getGender() {
		return gender;
	}
	//public setters
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

