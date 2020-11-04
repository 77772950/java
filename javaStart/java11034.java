package javaStart;
class Student{
	//�ʵ�, �ν��Ͻ� �ʵ�, ��������, Ŭ��������, static����
	public static int count=0;
//	public int getCount() {
//		return count;//�۵��� ������ �� ����� �� ������� �ʴ´�.
//	}
	
	private String name="ȫ�浿";
	public int kor=50;
	private int mat=50;
	private int eng=60;
	
	public Student() {
		this("ȫ�浿",50,50,60);//�����ھȿ� �����ڸ� ȣ���߱⿡ ���� ù �ٿ����� ���డ���ϴ�.
		
	}
	public Student(String name, int kor, int mat,int eng) {
		super();
		this.name=name;
		this.kor=kor;
		this.mat=mat;
		this.eng=eng;
		Student.count++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public double tot() {
		return kor+mat+eng;
	}
	public double avg() {
		return tot()/3.;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		if(kor<0) kor=0;
		if(kor>100) kor=100;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return name+"���� ����: "+tot()+"\n"+name+"���� ���: "+avg();
//		return "Student [name=" + name + ", kor=" + kor + ""
//				+ ", mat=" + mat + ", eng=" + eng + "]";
	}

}
public class java11034 {	
	public static void main(String[] args) {
		Student s1=new Student("ȫ�浿",50,62,92);
		//s1.kor=10;// ���ϰ� ���� ���ؼ�
		//s1.kor=-10;
//		s1.setKor(10);
//		s1.setKor(-10);
		//s1.kor
//		s1.getKor();
//		Student s1=new Student();		
//		System.out.println(s1.name+" ����: "+s1.tot()+s1.name+" ���: "+s1.avg());
		
		System.out.println(s1);//to String�� ���� �� �״�� ���
		Student s2=new Student("ȫ�泲",80,70,90);
//		s2.name="ȫ�泲";
//		s2.kor=70; s2.mat=60; s2.eng=80;
		s2.setKor(2313);
		s2.setName("ȫ���");
		System.out.println(s1.equals(s2));
		System.out.println(s2);
		System.out.println(Student.count);//to String�� ���� �� �״�� ���
//		System.out.println(s2.name+" ����: "+s2.tot()+s2.name+" ���: "+s2.avg());
	}

}
