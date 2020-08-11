package proyecto.spring.ventas.dao;

import java.util.List;

import proyecto.spring.ventas.entity.Producto;

public interface ProductoDAO {

	public List<Producto> listarProducto();
	public void saveProducto(Producto bean);
	public void deleteProducto(int cod);
	public Producto find(int codProd);
	public List<Producto> listarXId(int id);
	public List<Producto> listarProductoXSubTipoProducto(int codTipPro);
}
