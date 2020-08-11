package proyecto.spring.ventas.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_subca_categoria")
public class SubTipoProducto implements Serializable{
	
	@Id
	@Column(name="cod_subcat")
	private int codTipPro;
	@Column(name="nom_subcat")
	private String nom_subTipPro;
	@Column(name="fot_subcat")
	@JsonIgnore
	private byte[] foto;
	
	@ManyToOne()
	@JoinColumn(name="cod_cat")
	private TipoProductos tipoProducto;
	
	@OneToMany(mappedBy="tipoProducto")
	@JsonIgnore
	private List<Producto> listaProductoXSubTipoProducto;
	

	public int getCodTipPro() {
		return codTipPro;
	}

	public void setCodTipPro(int codTipPro) {
		this.codTipPro = codTipPro;
	}

	public String getNom_subTipPro() {
		return nom_subTipPro;
	}

	public void setNom_subTipPro(String nom_subTipPro) {
		this.nom_subTipPro = nom_subTipPro;
	}
	
	public TipoProductos getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProductos tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public List<Producto> getListaProductoXSubTipoProducto() {
		return listaProductoXSubTipoProducto;
	}

	public void setListaProductoXSubTipoProducto(List<Producto> listaProductoXSubTipoProducto) {
		this.listaProductoXSubTipoProducto = listaProductoXSubTipoProducto;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	
	

}
