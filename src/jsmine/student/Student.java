package jsmine.student;

public class Student {
	private String name; 
	private String sex;
	private String grade;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int mill;
	private int sum;
	private int rank; 
	private int avg;
	
	public Student(String name, String sex, int num, int kor, int eng, int math) {
		this.name = name;
		this.sex = sex;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = this.kor + this.eng + this.math;
		this.avg = this.sum / 3;
		this.rank = 1;
		
		this.setGrade();
	}
	
	public Student(String name, String sex, int num, int kor, int eng, int math, int mill) {
		this.name = name;
		this.sex = sex;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.mill = mill;
		this.sum = this.kor + this.eng + this.math + this.mill;
		this.avg = this.sum / 4;
		this.rank = 1;
		
		this.setGrade();
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", grade=" + grade + ", num=" + num + ", kor=" + kor
				+ ", eng=" + eng + ", math=" + math + ", mill=" + mill + ", sum=" + sum + ", rank=" + rank + ", avg="
				+ avg + "]";
	}

	private void setGrade() {
		String [] flag = {
			"가", "양", "미", "우", "수", "수++"
		};
		
		int value = this.avg / 10 - 5;

		this.grade = flag[value < 0 ? 0 : value];
	}
	
	
	
	//Getter Setter 
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public String getGrade() {
		return grade;
	}
	public int getNum() {
		return num;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getMill() {
		return mill;
	}
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
}
