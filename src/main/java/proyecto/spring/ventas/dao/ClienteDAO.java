package proyecto.spring.ventas.dao;

import proyecto.spring.ventas.entity.Cliente;

public interface ClienteDAO {
	
	public Cliente autenticar(String email, String pass);

}
