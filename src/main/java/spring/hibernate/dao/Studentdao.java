package spring.hibernate.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.hibernate.dao.entities.Student;
@Transactional
public class Studentdao {

	private static HibernateTemplate hibernateTemplate;
	
	public   static int insert(Student student) {
    Integer i=(Integer) hibernateTemplate.save(student);
	return i;
	
	}

	public static HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public static void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		Studentdao.hibernateTemplate = hibernateTemplate;
	}
	
	
}
