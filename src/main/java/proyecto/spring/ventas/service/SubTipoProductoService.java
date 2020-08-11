package proyecto.spring.ventas.service;

import java.util.List;

import proyecto.spring.ventas.entity.SubTipoProducto;


public interface SubTipoProductoService {
	
	public List<SubTipoProducto> listaSubtipoProductoXTipoProducto(int codTipProd);
	public SubTipoProducto find(int codTipProd);

}
