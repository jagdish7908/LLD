package designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        StudentBuilder builder = Student.getBuilder();
        builder.setName("John");
        builder.setCollegeName("MIT");
        builder.setScore(95);

        // create/build object using builder
        Student s = Student.build(builder);

        System.out.println("Name: " + s.getName());
        System.out.println("College Name: " + s.getCollegeName());
        System.out.println("Score: " + s.getScore());
    }
}
