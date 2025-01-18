package org.DesignPatterns.CreationalDesignPatterns.Builder.Solution2;

public class Student {
    public Integer id;
    public String name;
    public Integer batch;
    public String email;
    public String phone;
    public String gradYear;

    public static Builder getBuilder() {
        return new Builder();
    }

    public Student (Builder builder) {
        if(builder.getId() == null){
            throw new RuntimeException("ID must be greater than 0");
        }
        if(builder.getBatch() <= 2018){
            throw new RuntimeException("Batch must be greater than 2018");
        }

        this.id = builder.getId();
        this.name = builder.getName();
        this.batch = builder.getBatch();
        this.email = builder.getEmail();
        this.phone = builder.getPhone();
        this.gradYear = builder.getGradYear();
    }

}
