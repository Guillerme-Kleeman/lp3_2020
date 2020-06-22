package unae.lp3.notas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="otros")
public class OtroController {
	@RequestMapping (value="index", method=RequestMethod.GET )
	public String goIndex(Model datos) 
	{
	String titulo="otros/index";
	datos.addAttribute("titulo",titulo);
	return "pages/index";	
	}
}
