package proyecto.spring.ventas.service;

import java.util.List;

import proyecto.spring.ventas.entity.TipoProductos;

public interface TipoProductoService {

	public List<TipoProductos> listarTipoProductos();
	public void saveTipoProductos(TipoProductos bean);
	public void deleteTipoProductos(int codtip);
	
	public TipoProductos find(int codTip);
}
