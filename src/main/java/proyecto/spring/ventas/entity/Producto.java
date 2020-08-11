package proyecto.spring.ventas.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="tb_producto")
public class Producto implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_prod")
	private int codProd;
	@Column(name="nom_prod")
	private String nomProd;
	@Column(name="des_prod")
	private String desProd;
	@Column(name="pre_prod")
	private double preProd;
	@Column(name="sto_prod")
	private int stoProd;
	@Column(name="fot_prod")
	@JsonIgnore
	private byte[] foto;
	
	@ManyToOne
	@JoinColumn(name="cod_subca_catpro")
	private SubTipoProducto tipoProducto;

	public int getCodProd() {
		return codProd;
	}
	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	public String getNomProd() {
		return nomProd;
	}
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	public String getDesProd() {
		return desProd;
	}
	public void setDesProd(String desProd) {
		this.desProd = desProd;
	}
	public double getPreProd() {
		return preProd;
	}
	public void setPreProd(double preProd) {
		this.preProd = preProd;
	}
	public int getStoProd() {
		return stoProd;
	}
	public void setStoProd(int stoProd) {
		this.stoProd = stoProd;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public SubTipoProducto getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(SubTipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}	
	
	
}
