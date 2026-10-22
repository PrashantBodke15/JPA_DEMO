package org.example;

import jakarta.persistence.EntityManager;
import org.example.Util.JPAutil;
import org.example.Util.JPAutil;
import org.example.dao.StudentDAO;
import org.example.entity.Student;

public class Main {

    public static void main(String[] args) {

//        EntityManager entityManager = JPAutil.getentityManager();
//
//        System.out.println("JPA Connected Successfully");
//
//        entityManager.close();
//        JPAutil.close();

//        Student obj =  new Student("prashant","mca",90);
//        Student obj2 =  new Student("vaishnavi","Mca",90);
//        StudentDAO dao = new StudentDAO();
//        dao.insertStudent(obj);
//        dao.insertStudent(obj2);

       Student obj3 = new Student("prashant","mca",90);
       Student obj4 = new Student("vaishnavi","mca",90);
       StudentDAO dao1 = new StudentDAO();
       dao1.deleteStudent(obj3 );
       dao1.deleteStudent(obj4);




    }
}