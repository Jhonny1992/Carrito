package proyecto.spring.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.spring.ventas.dao.ClienteDAO;
import proyecto.spring.ventas.entity.Cliente;
@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDAO clienteDAO;
	
	@Override
	public Cliente autenticar(String email, String pass) {
		return clienteDAO.autenticar(email, pass);
	}

}
