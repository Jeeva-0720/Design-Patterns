package org.DesignPatterns.CreationalDesignPatterns.Builder.Solution3;

public class Client {
    public static void main(String[] args) {

        Student st = Student.getBuilder()
                        .setId(1)
                        .setName("Jack")
                        .setEmail("jack@gmail.com")
                        .setBatch(2019)
                        .getBuild();

        System.out.println(st);
    }
}
