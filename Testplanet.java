public class Testplanet{
	public static void main(String[] args){
		Planet p1;
		Planet p2;
		p1 = new Planet(100, 0, 30,41, 1241200000, "asdds");
		p2 = new Planet(100, 0, 30,41, 1241200000, "asdds");
		System.out.println(p1.calcForceExertedBy(p2));
	}
}