package proyecto.spring.ventas.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import proyecto.spring.ventas.entity.Cliente;
@Repository
public class ClienteDAOImpl implements ClienteDAO {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public Cliente autenticar(String email, String pass) {
		Session sesion=factory.getCurrentSession();
		Query query =null;
		try {
			query=sesion.createQuery("From Cliente where emaCli = ?1 and pasCli = ?2");
			query.setParameter(1, email);
			query.setParameter(2, pass);
			
			return (Cliente) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}

}
