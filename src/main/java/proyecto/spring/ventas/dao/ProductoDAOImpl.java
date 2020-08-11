package proyecto.spring.ventas.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import proyecto.spring.ventas.entity.Producto;
@Repository
public class ProductoDAOImpl implements ProductoDAO{

	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly=true)
	@Override
	public List<Producto> listarProducto() {
		Session session=factory.getCurrentSession();
		Query query=null;
		try {
			query=session.createQuery("select p from Producto p");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Override
	public void saveProducto(Producto bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProducto(int cod) {
		// TODO Auto-generated method stub
		
	}
	@Transactional(readOnly=true)
	@Override
	public List<Producto> listarProductoXSubTipoProducto(int codTipPro) {
		Session session=factory.getCurrentSession();
		Query query=null;
		try {
			query=session.createQuery("select p from Producto p where p.tipoProducto.codTipPro=?1");
			query.setParameter(1, codTipPro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	@Transactional(readOnly=true)
	@Override
	public Producto find(int codProd) {
		Session session=factory.getCurrentSession();
		Producto bean=null;
		try {
			bean=session.get(Producto.class, codProd);	
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	public List<Producto> listarXId(int id) {
		Session session=factory.getCurrentSession();
		Query query=null;
		try {
			query=session.createQuery("select p from Producto p where p.codProd=?1");
			query.setParameter(1, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

}
