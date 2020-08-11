package proyecto.spring.ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import proyecto.spring.ventas.service.ClienteService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private ClienteService clienteService;
	
	
	
}
