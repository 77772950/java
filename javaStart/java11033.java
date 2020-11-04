package javaStart;
class Circle{
	public double radius=4;
	public double pie=3.14;
	public double circumference() {//µ—∑π
		return 2*radius*pie;
	}
	public double area() {//≥–¿Ã
		return radius*radius*pie;
	}
	public Circle(){}
	public Circle(double radius, double pie) {
		super();
		this.radius = radius;
		this.pie = pie;
	}
	
}
public class java11033 {

	public static void main(String[] args) {
		 Circle c1=new Circle(6,3.14);
		 Circle c2=new Circle(7,3.14);
//		 c1.radius=6;
		 System.out.println(c1.area());
		 System.out.println(c1.circumference());
//		 c2.radius=7;
		 System.out.println(c2.area());
		 System.out.println(c2.circumference());
	}

}
