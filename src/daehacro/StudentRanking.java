package daehacro;

/**
 * Created by imcts on 2016. 9. 4..
 */

class Student {
    private String name;
    private String gender;
    private int kor;
    private int eng;
    private int math;
    private int mill;
    private int avg;
    private int rank;


    public Student(String name, String gender, int kor, int eng, int math) {
        this.name   = name;
        this.gender = gender;
        this.kor    = kor;
        this.eng    = eng;
        this.math   = math;
        this.rank   = 1;
    }

    public Student(String name, String gender, int kor, int eng, int math, int mill) {
        this(name, gender, kor, eng, math);
        this.mill = mill;
    }

    //get set.
    public int getAvg() {
        int sum = this.kor + this.eng + this.math;
        return this.gender.equals("여자") ? sum / 3 : sum + this.mill / 4;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", mill=" + mill +
                ", avg=" + avg +
                ", rank=" + rank +
                '}';
    }
}

public class StudentRanking {

    public static void main(String[] args) {
        Student [] students = new Student [] {
            new Student("김태희", "여자", 93, 82, 73),
            new Student("박보영", "여자", 50, 63, 88),
            new Student("천우희", "여자", 24, 83, 99),
            new Student("오연서", "여자", 82, 77, 90),
            new Student("김고은", "여자", 50, 60, 80),
            new Student("배수지", "여자", 87, 52, 74),
            new Student("한고은", "여자", 88, 77, 66),
            new Student("박보검",  "남자", 23, 67, 88, 100)
        };

        for(Student prevStudent : students) {
            for(Student nextStudent : students) {
                if(prevStudent.getAvg() < nextStudent.getAvg()) {
                    prevStudent.setRank(
                            prevStudent.getRank() + 1
                    );
                }
            }
        }

        for(Student student : students) {
            System.out.println(student.toString());
        }
    }
}
