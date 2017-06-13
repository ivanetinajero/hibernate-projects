package net.itinajero.app.dao;
import org.hibernate.Session;
import net.itinajero.app.dao.HibernateUtil;
import net.itinajero.app.model.Usuario;

public class Principal {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		user.setNombre("Pedro");
		user.setEmail("pedro@gmail.com");		
		Session session =  HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.close();
	}

}
