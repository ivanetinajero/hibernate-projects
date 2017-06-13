package net.itinajero.app.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import net.itinajero.app.model.Usuario;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	/**
	 * Factory con hibernate.properties
	 * @return
	 */
	private static SessionFactory buildSessionFactory() {
		try{
			Configuration config = new Configuration();
			config.addAnnotatedClass(Usuario.class);
			return config.buildSessionFactory(new StandardServiceRegistryBuilder().build());
		}catch(Exception ex){
			System.out.println("Error: " + ex.getMessage());
			return null;
		}
	}	
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
}
