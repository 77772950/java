package javaStart;
class Triangle{
	public double h=20;
	public double w=40;
	public double area() {//≥–¿Ã
		return h*w/2;
	}
	public double periphery() {//µ—∑π
		return 2*h+w;
	}
	public Triangle() {}
	public Triangle(double h, double w) {
		super();
		this.h = h;
		this.w = w;
	}
	
}
public class java11032 {

	public static void main(String[] args) {
		Triangle t1=new Triangle(10,8);
		Triangle t2=new Triangle(9,7);
//		t1.h=10;
//		t1.w=8;
		System.out.println(t1.area());
		System.out.println(t1.periphery());
//		t2.h=9;
//		t2.w=7;
		System.out.println(t2.area());
		System.out.println(t2.periphery());
	}

}
