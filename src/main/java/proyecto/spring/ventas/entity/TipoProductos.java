package proyecto.spring.ventas.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_categoria_producto")
public class TipoProductos implements Serializable{
	
	@Id
	@Column(name="cod_catprod")
	private int codTipProd;
	@Column(name="nom_catprod")
	private String nomTipProd;
	@Column(name="fot_catprod")
	@JsonIgnore
	private byte[] foto;
	
	
	@OneToMany(mappedBy="tipoProducto")
	@JsonIgnore
	private List<SubTipoProducto> listaSubTipoProductoXTipoProducto;
	
	
	public int getCodTipProd() {
		return codTipProd;
	}
	public void setCodTipProd(int codTipProd) {
		this.codTipProd = codTipProd;
	}
	public String getNomTipProd() {
		return nomTipProd;
	}
	public void setNomTipProd(String nomTipProd) {
		this.nomTipProd = nomTipProd;
	}
	public List<SubTipoProducto> getListaSubTipoProductoXTipoProducto() {
		return listaSubTipoProductoXTipoProducto;
	}
	public void setListaSubTipoProductoXTipoProducto(List<SubTipoProducto> listaSubTipoProductoXTipoProducto) {
		this.listaSubTipoProductoXTipoProducto = listaSubTipoProductoXTipoProducto;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	
	

}
