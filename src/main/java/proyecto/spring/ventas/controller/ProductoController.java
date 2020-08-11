package proyecto.spring.ventas.controller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import proyecto.spring.ventas.entity.Producto;
import proyecto.spring.ventas.entity.SubTipoProducto;
import proyecto.spring.ventas.entity.TipoProductos;
import proyecto.spring.ventas.service.ProductoService;
import proyecto.spring.ventas.service.SubTipoProductoService;
import proyecto.spring.ventas.service.TipoProductoService;

@Controller
@RequestMapping("/web")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	@Autowired
	private TipoProductoService tipoproductoService;
	@Autowired
	private SubTipoProductoService subtipoproductoService;
	
	@RequestMapping("/")
	private String index(Model m) {
		List<Producto> lista=productoService.listarProducto();
		m.addAttribute("productos", lista);
		return "web";
	}
	
	@RequestMapping(value="/verFoto")
	public ResponseEntity<byte[]> verFoto(@RequestParam("codigo") int cod) {
		Producto bean=productoService.find(cod);
		byte[] image=bean.getFoto();
		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(image) ;
	}
	
	@RequestMapping(value="/verFotoTipProducto")
	public ResponseEntity<byte[]> verFotoTipProducto(@RequestParam("codigo") int codTip) {
		TipoProductos bean=tipoproductoService.find(codTip);
		byte[] image=bean.getFoto();
		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(image) ;
	}
	
	@RequestMapping(value="/verFotoSubTipPro")
	public ResponseEntity<byte[]> verFotoSubTipPro(@RequestParam("codigo") int codTipProd) {
		SubTipoProducto bean=subtipoproductoService.find(codTipProd);
		byte[] image=bean.getFoto();
		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(image) ;
	}

	
	@RequestMapping("/tipoproductocat")
	public String tipoProductoCat(Model m) {
		List<TipoProductos> lista=tipoproductoService.listarTipoProductos();
		m.addAttribute("tipProductos",lista);
		return "tiposproducto";
	}
	
	@RequestMapping("/subtipprod")
	public String subtipprod(@RequestParam("codigosubtipo")int codTipProd,Model m) {
		List<SubTipoProducto> lista=subtipoproductoService.listaSubtipoProductoXTipoProducto(codTipProd);
		m.addAttribute("substipproductos", lista);
		return "subtipoproducto";
	}
	
	@RequestMapping("/prodxsubtipo")
	public String prodxsubtipo(@RequestParam("codigotipo")int codTipPro,Model m) {
		List<Producto> lista=productoService.listarProductoXSubTipoProducto(codTipPro);
		m.addAttribute("productoxsubtipo", lista);
		return "categoriaproductos";
	}
	
	
	/*@RequestMapping("/subtipoproducto")
	public List<SubTipoProducto> listaSubtipoProductoXTipoProducto(@RequestParam("codTipProd") int codTipProd, Model m){
		m.addAttribute("substipproductos", codTipProd);
		ModelAndView mav=new ModelAndView();
		List<SubTipoProducto> lista=subtipoproductoService.listaSubtipoProductoXTipoProducto(codTipProd);
		mav.setViewName("subtipoproducto");
		return lista;
	}*/
}
