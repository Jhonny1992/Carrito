package proyecto.spring.ventas.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import proyecto.spring.ventas.entity.TipoProductos;

@Repository
public class TipoProductoDAOImpl implements TipoProductoDAO {
	
	@Autowired
	private SessionFactory factory;
	

	@Transactional(readOnly=true)
	@Override
	public List<TipoProductos> listarTipoProductos() {
		Session session=factory.getCurrentSession();
		Query query=null;
		try {
			query=session.createQuery("select tp from TipoProductos tp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Override
	public void saveTipoProductos(TipoProductos bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTipoProductos(int codtip) {
		// TODO Auto-generated method stub
		
	}
	@Transactional(readOnly=true)
	@Override
	public TipoProductos find(int codTip) {
		Session session=factory.getCurrentSession();
		TipoProductos bean=null;
		try {
			bean=session.get(TipoProductos.class, codTip);	
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

}
