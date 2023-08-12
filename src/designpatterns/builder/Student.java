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

    public void setName(String name) {
        this.name = name;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
