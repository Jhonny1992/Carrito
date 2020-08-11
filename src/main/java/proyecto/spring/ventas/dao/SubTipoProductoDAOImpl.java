package proyecto.spring.ventas.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import proyecto.spring.ventas.entity.SubTipoProducto;
@Repository
public class SubTipoProductoDAOImpl implements SubTipoProductoDAO {

	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly=true)
	@Override
	public List<SubTipoProducto> listaSubtipoProductoXTipoProducto(int codTipProd) {
		Session session=factory.getCurrentSession();
		Query query=null;
		try {
			query=session.createQuery("select stp from SubTipoProducto stp where stp.tipoProducto.codTipProd=?1");
			query.setParameter(1, codTipProd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	@Transactional(readOnly=true)
	@Override
	public SubTipoProducto find(int codTipProd) {
		Session session=factory.getCurrentSession();
		SubTipoProducto bean=null;
		try {
			bean=session.get(SubTipoProducto.class, codTipProd);	
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}


}
