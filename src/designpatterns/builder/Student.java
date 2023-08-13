package designpatterns.builder;

public class Student {
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

    private Student(StudentBuilder builder) {
        // validations
        if(builder.getScore() < 0 || builder.getScore() > 100) {
            throw new IllegalArgumentException("Score should be between [0-100]");
        }
        this.name = builder.getName();
        this.collegeName = builder.getCollegeName();
        this.score = builder.getScore();
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    public static Student build(StudentBuilder builder) {
        return new Student(builder);
    }
}
