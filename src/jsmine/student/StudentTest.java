package jsmine.student;

public class StudentTest {
	public static void main(String [] args) {
		//실행만 하는 것. 이 메소드는 JVM이 실행해주는 메소드이기 때문에. 
		StudentClass studentClass = new StudentClass(1, new Student [] {
				new Student("박서준", "남자", 1, 90, 80, 30, 80),
				new Student("크러쉬", "남자", 2, 95, 83, 75, 50),
				new Student("이광수", "남자", 3, 75, 50, 80, 90),
				new Student("신연종", "여자", 4, 95, 97, 90),
				new Student("정수진", "여자", 5, 55, 90, 60),
				new Student("임유리", "여자", 6, 85, 79, 79)
		});
		
		//등수순
		studentClass.printOrderRank();
	}
}
