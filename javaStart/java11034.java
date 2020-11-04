package javaStart;
class Student{
	//필드, 인스턴스 필드, 정적변수, 클래스변수, static변수
	public static int count=0;
//	public int getCount() {
//		return count;//작동은 되지만 이 방법은 잘 사용하지 않는다.
//	}
	
	private String name="홍길동";
	public int kor=50;
	private int mat=50;
	private int eng=60;
	
	public Student() {
		this("홍길동",50,50,60);//생성자안에 생성자를 호출했기에 오직 첫 줄에서만 실행가능하다.
		
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
		return name+"님의 총점: "+tot()+"\n"+name+"님의 평균: "+avg();
//		return "Student [name=" + name + ", kor=" + kor + ""
//				+ ", mat=" + mat + ", eng=" + eng + "]";
	}

}
public class java11034 {	
	public static void main(String[] args) {
		Student s1=new Student("홍길동",50,62,92);
		//s1.kor=10;// 못하게 막기 위해서
		//s1.kor=-10;
//		s1.setKor(10);
//		s1.setKor(-10);
		//s1.kor
//		s1.getKor();
//		Student s1=new Student();		
//		System.out.println(s1.name+" 총점: "+s1.tot()+s1.name+" 평균: "+s1.avg());
		
		System.out.println(s1);//to String에 값이 들어가 그대로 출력
		Student s2=new Student("홍길남",80,70,90);
//		s2.name="홍길남";
//		s2.kor=70; s2.mat=60; s2.eng=80;
		s2.setKor(2313);
		s2.setName("홍길숙");
		System.out.println(s1.equals(s2));
		System.out.println(s2);
		System.out.println(Student.count);//to String에 값이 들어가 그대로 출력
//		System.out.println(s2.name+" 총점: "+s2.tot()+s2.name+" 평균: "+s2.avg());
	}

}
