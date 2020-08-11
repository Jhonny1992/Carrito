package proyecto.spring.ventas.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Cliente implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_cli")
	private int codUsu;
	@Column(name="nom_cli")
	private String nomUsu;
	@Column(name="ape_cli")
	private String apeCli;
	@Column(name="dir_cli")
	private String dirCli;
	@Column(name="email_cli")
	private String emaCli;
	@Column(name="pass_cli")
	private String pasCli;
	public int getCodUsu() {
		return codUsu;
	}
	public void setCodUsu(int codUsu) {
		this.codUsu = codUsu;
	}
	public String getNomUsu() {
		return nomUsu;
	}
	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}
	public String getApeCli() {
		return apeCli;
	}
	public void setApeCli(String apeCli) {
		this.apeCli = apeCli;
	}
	public String getDirCli() {
		return dirCli;
	}
	public void setDirCli(String dirCli) {
		this.dirCli = dirCli;
	}
	public String getEmaCli() {
		return emaCli;
	}
	public void setEmaCli(String emaCli) {
		this.emaCli = emaCli;
	}
	public String getPasCli() {
		return pasCli;
	}
	public void setPasCli(String pasCli) {
		this.pasCli = pasCli;
	}
	
	
	
	
	
}
