package org.example.dao;
import jakarta.persistence.EntityManager;
import org.example.Util.JPAutil;
import org.example.entity.Student;


public class StudentDAO {
    public void insertStudent(Student student){
        EntityManager em = JPAutil.getentityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        System.out.println("student Added Sucessfully");
    }

    public void deleteStudent(Student student){
        EntityManager em = JPAutil.getentityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        System.out.println("student deleted successfully");
    }

}
