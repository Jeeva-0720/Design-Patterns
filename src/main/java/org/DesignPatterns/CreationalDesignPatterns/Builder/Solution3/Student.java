package org.DesignPatterns.CreationalDesignPatterns.Builder.Solution3;

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

    private Student (Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.batch = builder.batch;
        this.email = builder.email;
        this.phone = builder.phone;
        this.gradYear = builder.gradYear;
    }

    public static class Builder {
        public Integer id;
        public String name;
        public Integer batch;
        public String email;
        public String phone;
        public String gradYear;

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBatch(Integer batch) {
            this.batch = batch;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setGradYear(String gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student getBuild(){
            if(id == null){
                throw new RuntimeException("ID must be greater than 0");
            }
            if(batch <= 2018){
                throw new RuntimeException("Batch must be greater than 2018");
            }

            return new Student(this);
        }
    }

}
