package org.example.Util;
import  jakarta.persistence.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;




public class JPAutil {
    private static  final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("student-unit");

    public static EntityManager getentityManager(){
        return emf.createEntityManager();
    }
    public static void close(){
        emf.close();
    }
}
