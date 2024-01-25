package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Employee e2 = new Employee(194, "dinesh", "kumar");
		System.out.println(e2);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(e2);
		tx.commit();
		factory.close();
	}

}