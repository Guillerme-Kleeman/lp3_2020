package unae.lp3.notas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="pagina")
public class PagesController {
	@RequestMapping (value="index", method=RequestMethod.GET )
	public String goIndex(Model datos) 
	{
	String titulo="pages/index";
	datos.addAttribute("titulo",titulo);
	return "pages/index";	
	}
	@RequestMapping (value="saludo/{nombre}/{apellido}", method=RequestMethod.GET )	
public String goSaludo(Model datos, @PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido) 
	{
	datos.addAttribute("nombre",nombre);	
	datos.addAttribute("apellido",apellido);	
	return "pages/saludos";
	}	
	
	@GetMapping(value="parametros")
	public String getParam(@RequestParam("var") String valor, Model datos )
	{
		datos.addAttribute("valor",valor);
		return "pages/getparam";
	}
	@PostMapping(value="pparam")
	public String postParam(@RequestParam("nombre") String valor, Model datos )
	{
		datos.addAttribute("valor",valor);
		return "pages/postparam";
	}
	
}
