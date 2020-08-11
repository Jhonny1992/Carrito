package proyecto.spring.ventas.service;

import proyecto.spring.ventas.entity.Cliente;

public interface ClienteService {
	
	public Cliente autenticar(String email, String pass);

}
