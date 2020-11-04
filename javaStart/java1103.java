package javaStart;
//class�� ������.
//�ϳ��� ���Ͼȿ� �ΰ��� public class�� ������ �� ����.
class Rectangle{
	public static double unit=1;
	private double h=20;
	private double w=40;
	public double getH() {
		return h;
	}
	public void setH(double h) {
		if(h<0) h=0;
		this.h = h;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public static double function1(double h, double w) {
		return 2*h+2*w*unit;
	}
	public double function1() {
		return 2*h+2*w;
	}
	public double function2() {
		return h*w;            
	}
	public Rectangle() {}//�⺻������ ����
	public Rectangle(double w) {
		this(w,w);
//		this.w = w;
	}
	
	@Override
	public String toString() {
		return "Rectangle [h=" + h + ", w=" + w + "]"
				+this.function1();
	}
	public Rectangle(double h, double w) {
		super();
		this.h = h;
		this.w = w;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(h);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(w);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(h) != Double.doubleToLongBits(other.h))
			return false;
		if (Double.doubleToLongBits(w) != Double.doubleToLongBits(other.w))
			return false;
		return true;
	}
	
}
public class java1103 {

	public static void main(String[] args) {
//		Rectangle.unit=100;
		System.out.println(Rectangle.function1(40,10));//public static double function1 ȣ��
		Rectangle r1=new Rectangle(20,30);
		Rectangle r2=new Rectangle(30);
//		System.out.println(r1.function1());
//		System.out.println(r1.function2());
//		System.out.println(r2.function1());
//		Rectangle r1=new Rectangle();
		//�����ڸ� ���� �� ����ǥ�ð� ������ ������ �⺻�����ڰ� ����̴�.
//		Rectangle r2=new Rectangle();
//		r1.h=30;	r1.w=20;
//		System.out.println(r1.function1());
//		System.out.println(r1.function2());
//		r2.h=40;	r2.w=50;
//		System.out.println(r2.function1());
//		System.out.println(r2.function2());
		 // ���簢�� ����, �ѷ��� ���ϴ� ���α׷��� ������.
		//���� �����ϱ� ���Ѵٸ� ���⼭ �ٲ� �� �ִ�.
//		h=50;
//		w=30;
//		System.out.println(function1());
//		System.out.println(function2());
		//�ﰢ��, �� Ŭ������ ����� ����.11032,11033����
		//setter,getter
		r1.setH(50);
		System.out.println(r1.getH());
		System.out.println(r1);
		

	}

}
