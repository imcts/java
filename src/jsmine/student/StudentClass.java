package jsmine.student;

public class StudentClass {
	private int ban;
	private Student [] students;
	
	public StudentClass(int ban, Student[] students) {
		this.ban = ban;
		this.students = students;
	}
	
	//등수순으로 출력합니다.
	public void printOrderRank() {
		//등수를 구합니다.
		for(Student student : this.students) {
			for(Student innerStudent : this.students) {
				if(student.getAvg() < innerStudent.getAvg()) {
					student.setRank(student.getRank() + 1);
				}
			}
		}

		//등수순으로 정렬
		for(int i = 0, len = this.students.length; i < len; i++) {
			for(int j = 0; j < len; j++) {
				Student student = this.students[j];
				
				if(student.getRank() == i + 1) {
					this.students[j] = students[i];
					this.students[i] = student;
					break;
				}
			}
		}
		
		this.print();
	}
	
	private void print() {
		System.out.println("이름\t나이\t성별\t");
		
		//학생을 출력합니다. 
		for(Student student : this.students) {
			System.out.println(student.toString());
		}
	}
}
