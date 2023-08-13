package designpatterns.builder;

public class StudentBuilder {
    private String name;
    private String collegeName;
    private int score;

    public String getName() {
        return name;
    }

    public  String getCollegeName() {
        return collegeName;
    }

    public int getScore() { return score; }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setScore(int score) {this.score = score;}
}
