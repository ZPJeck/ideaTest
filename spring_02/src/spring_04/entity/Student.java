package spring_04.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;
    private String name;
    private Double score;
    private String phone;
    public  Student(){
        super();
    }
    public Student(Integer id,String name,Double score,String phone){
        this.id=id;
        this.name=name;
        this.score=score;
        this.phone=phone;
    }

    @Override
    public String toString() {
        return "[ id="+id+
                "name="+name+
                "score="+score+
                "phone="+phone+
                "]";
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
