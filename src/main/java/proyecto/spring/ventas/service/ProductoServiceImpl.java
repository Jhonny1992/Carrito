package proyecto.spring.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.spring.ventas.dao.ProductoDAO;
import proyecto.spring.ventas.entity.Producto;
@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoDAO productoDAO;
	
	@Override
	public List<Producto> listarProducto() {
		return productoDAO.listarProducto();
	}

	@Override
	public void saveProducto(Producto bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProducto(int cod) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Producto> listarProductoXSubTipoProducto(int codTipPro) {
		return productoDAO.listarProductoXSubTipoProducto(codTipPro);
	}

	@Override
	public Producto find(int codProd) {
		return productoDAO.find(codProd);
	}

	@Override
	public List<Producto> listarXId(int id) {
		return productoDAO.listarXId(id);
	}

}
