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

    public static class StudentBuilder {
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

        public Student build() {
            return new Student(this);
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setCollegeName(String collegeName) {
            this.collegeName = collegeName;
            return this;
        }

        public StudentBuilder setScore(int score) {
            this.score = score;
            return this;
        }
    }
}
