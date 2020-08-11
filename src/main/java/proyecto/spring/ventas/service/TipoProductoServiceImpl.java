package proyecto.spring.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.spring.ventas.dao.TipoProductoDAO;
import proyecto.spring.ventas.entity.TipoProductos;
@Service
public class TipoProductoServiceImpl implements TipoProductoService{

	@Autowired
	private TipoProductoDAO tipoproductoDAO;
	
	@Override
	public List<TipoProductos> listarTipoProductos() {
		return tipoproductoDAO.listarTipoProductos();
	}

	@Override
	public void saveTipoProductos(TipoProductos bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTipoProductos(int codtip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TipoProductos find(int codTip) {
		return tipoproductoDAO.find(codTip);
	}

}
