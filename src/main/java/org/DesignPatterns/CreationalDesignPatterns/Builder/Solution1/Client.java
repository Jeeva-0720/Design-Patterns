package org.DesignPatterns.CreationalDesignPatterns.Builder.Solution1;

public class Client {
    public static void main(String[] args) {
        Builder builder = Student.getBuilder();
        builder.setId(1);
        builder.setName("Jack");
        builder.setEmail("jack@gmail.com");
        builder.setBatch(2019);

        Student st = new Student(builder);

        System.out.println(st);

    }
}
