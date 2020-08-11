package proyecto.spring.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.spring.ventas.dao.SubTipoProductoDAO;
import proyecto.spring.ventas.entity.SubTipoProducto;

@Service
public class SubTipoProductoServiceImpl implements SubTipoProductoService {

	@Autowired
	private SubTipoProductoDAO subtipoproductoDAO;

	@Override
	public List<SubTipoProducto> listaSubtipoProductoXTipoProducto(int codTipProd) {
		return subtipoproductoDAO.listaSubtipoProductoXTipoProducto(codTipProd);
	}

	@Override
	public SubTipoProducto find(int codTipProd) {
		return subtipoproductoDAO.find(codTipProd);
	}
	
}
