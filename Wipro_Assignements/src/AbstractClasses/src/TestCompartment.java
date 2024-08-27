import java.util.*;

public class TestCompartment {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Compartment[] compartment = new Compartment[10];
		Random rand = new Random();
		for(int i=0;i<compartment.length;i++) {
			int compartmentType = rand.nextInt(4);
			switch (compartmentType) {
			case 0:
				compartment[i]=new FirstClass();
				break;
			case 1:
				compartment[i]=new Ladies();
				break;
			case 2:
				compartment[i]=new General();
				break;
			case 3:
				compartment[i]=new Luggage();
				break;
			
			}
			
		}
		for(Compartment j : compartment) {
			System.out.println(j.notice());
		}
	}

}
