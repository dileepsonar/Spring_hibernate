package com.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hibernate.dao.entities.Student;

import spring.hibernate.dao.Studentdao;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       Studentdao student= (Studentdao) context.getBean("studentdao",Studentdao.class);
       Student student1=new Student(8798,"dileep","bidar");
       int r= Studentdao.insert(student1);
       System.out.println("done"+r);
    }
}
