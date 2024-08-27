
public class XYZ implements Cloneable{
	
	int a;
	double d;
	XYZ cloneTest() {
		try {
			return (XYZ) super.clone();
			}
		catch(CloneNotSupportedException e) {
			System.out.println("Clonin not allowed");
			return this;
		}
	}
	XYZ x1=new XYZ();
	XYZ x2;
	

}
