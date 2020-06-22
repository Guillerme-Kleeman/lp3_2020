package unae.lp3.notas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import unae.lp3.notas.model.Nota;
import unae.lp3.notas.service.INotasService;

@Controller
@RequestMapping(value="notas")
public class NotasController {
	@Autowired 
	private INotasService serviceNotas;
	@RequestMapping(value="/", method=RequestMethod.GET) 
	public String index(Model datos)
	{		
		String titulo="Todas las Notas";
		String contenido="soy el contenido de DOS";
		datos.addAttribute("titulo",titulo);
		datos.addAttribute("contenido",contenido);
		List <Nota> notas= serviceNotas.getNotas();
		datos.addAttribute("notas", notas);
		return "notas/index";
	}
	@GetMapping(value="nuevo")
	public String nuevo() 
	{		
	return "notas/f_new";	
	}
	@PostMapping(value="nuevo")
	public String guardar(Nota nota, Model datos) 
	{
	String titulo=nota.getTitulo();
	String contenido="ha creado una nueva Nota";
	serviceNotas.insertNota(nota);	
	datos.addAttribute("titulo",nota.getTitulo());
	datos.addAttribute("contenido",nota.getContenido());
	datos.addAttribute("nota", nota);	
	return "notas/show";	
	}
	@RequestMapping (value="{id}/borrar", method=RequestMethod.GET )	
public String borrar(Model datos, @PathVariable("id") int notaId) 
	{
	Nota nota=serviceNotas.getNota(notaId);	
	String titulo=nota.getTitulo();
	String contenido="ha sido eliminado";	
	datos.addAttribute("titulo",titulo);	
	datos.addAttribute("contenido",contenido);
	datos.addAttribute("nota", nota);	
	
	serviceNotas.deleteNota(notaId);	
	
	return "notas/show";
	}	
	@RequestMapping (value="{id}/editar", method=RequestMethod.GET )	
public String editar(Model datos, @PathVariable("id") int notaId) 
	{
	Nota nota=serviceNotas.getNota(notaId);	
	String titulo=nota.getTitulo();
	String contenido="ha sido eliminado";	
	datos.addAttribute("titulo",titulo);	
	datos.addAttribute("contenido",contenido);
	datos.addAttribute("nota", nota);	
	//serviceNotas.deleteNota(notaId);	
	return "notas/f_edit";
	}	
	@PostMapping(value="{id}/editar")
	public String actualizar(Nota nota, Model datos) 
	{

	nota=serviceNotas.saveNota(nota);
	String titulo=nota.getTitulo();
	String contenido="ha actualizado una  Nota";
	datos.addAttribute("titulo",nota.getTitulo());
	datos.addAttribute("contenido",contenido);
	datos.addAttribute("nota", nota);	
	return "notas/show";	
	}	
	
}
