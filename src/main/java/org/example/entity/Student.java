package org.example.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "Student_name",
            nullable = false,
            length = 50)

    private  int id;
    private  String name;
    private  String course;
    private  double marks;



    public Student(int id, String name, String course, double marks){
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;

    }
    public Student(String name,String course, double marks){
        this.name = name;
        this.course = course;
        this.marks = marks;
    }


    public  int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

   // @Override
//    public String toString(){
//        return "Student{"+
//                "id=" +id +
//                "name=" + name + '\'' +
//                "course= "+ course + '\'' +
//                "marks= " + marks +
//                '}';
//    }
}
