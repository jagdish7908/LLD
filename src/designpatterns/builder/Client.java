package designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        Student s = Student.getBuilder()
                            .setName("John")
                            .setCollegeName("MIT")
                            .setScore(95)
                            .build();

        System.out.println("Name: " + s.getName());
        System.out.println("College Name: " + s.getCollegeName());
        System.out.println("Score: " + s.getScore());
    }
}
