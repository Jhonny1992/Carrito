package proyecto.spring.ventas.dao;

import java.util.List;

import proyecto.spring.ventas.entity.SubTipoProducto;


public interface SubTipoProductoDAO {
	
	public List<SubTipoProducto> listaSubtipoProductoXTipoProducto(int codTipProd);
	public SubTipoProducto find(int codTipProd);

}
