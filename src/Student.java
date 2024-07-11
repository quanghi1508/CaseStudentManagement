import java.time.LocalDate;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private int averageScore;

    public Student(int averageScore, LocalDate dateOfBirth, String name, int id) {
        this.averageScore = averageScore;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.id = id;
    }

    public Student(int id, String name, String dateOfBirth, String averageScore) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "----Student----"+"\n"+
                "Id            : " + id + "\n" +
                "Name          : " + name + "\n" +
                "Date of birth : " + dateOfBirth + "\n" +
                "Average Score : " + averageScore + "\n" ;
    }

    @Override
    public int compareTo(Student o) {
        if (this.averageScore < o.averageScore)
            return -1;
        if (this.averageScore > o.averageScore)
            return 1;
        return 0;
    }
}
