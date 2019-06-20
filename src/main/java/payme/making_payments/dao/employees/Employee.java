package payme.making_payments.dao.employees;

import java.util.Date;

public class Employee {

    private Integer id;
    private String name;
    private String gender;
    private String recommendation;
    private String marital_status;
    private Date birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", recommendation='" + recommendation + '\'' +
                ", marital_status='" + marital_status + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Employee setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Employee setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public Employee setRecommendation(String recommendation) {
        this.recommendation = recommendation;
        return this;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public Employee setMarital_status(String marital_status) {
        this.marital_status = marital_status;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Employee setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }
}

