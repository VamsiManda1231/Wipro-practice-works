
public class Box {
	private int height;
	private int width;
	private int depth;
	//constructor of box
		public Box(int a, int b, int c) {
			System.out.println("----The dimensions of box are----");
			this.height=a;
			this.width=b;
			this.depth=c;
			
		}
		//method to calculate the volume
		public double BoxVolume(){
			return height*width*depth;
			}
			//main method
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Box mybox = new Box(10,10,10);
			double vol = mybox.BoxVolume();
			System.out.println("The volume of the box is: "+vol);					
		}
}
