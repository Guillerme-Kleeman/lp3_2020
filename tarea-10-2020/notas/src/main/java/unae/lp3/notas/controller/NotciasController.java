package unae.lp3.notas.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import unae.lp3.notas.model.Categoria;
import unae.lp3.notas.model.Noticia;
import unae.lp3.notas.service.CategoriasServiceImpl;
import unae.lp3.notas.service.NoticiasServicesImpl;

@Controller
@RequestMapping(value="noticias")
public class NotciasController {
	
	@Autowired 
	private NoticiasServicesImpl servNoti;
	@Autowired 
	private CategoriasServiceImpl caterepo;
	
	@GetMapping(value="/")	
	public String index(Model datos) 
	{
		String titulo="Todas las Noticias";
		String contenido="soy el contenido de DOS";
		datos.addAttribute("titulo",titulo);
		datos.addAttribute("contenido",contenido);
		List <Noticia> noticias= servNoti.getNoticias();
		datos.addAttribute("datos", noticias);
		return "noticias/index";
	}
	
	@PostMapping(value="guardar")
	public String save(Noticia noticia) 
	{
		servNoti.saveNoticia(noticia);
		return "redirect:/noticias/";
	}
	
	@GetMapping(value="nuevo")
	public String add(Model datos) 
	{
		Noticia nuevaNoticia = new Noticia();
		nuevaNoticia.setFecha(new Date(System.currentTimeMillis()));
		List<Categoria> categorias= (List<Categoria>) caterepo.getCategorias();
		datos.addAttribute("noticia", nuevaNoticia);
		datos.addAttribute("categorias",categorias);
		datos.addAttribute("titulo", "Crear");
		return "noticias/f_new";	
	}
	
	@GetMapping(value="editar/{id}")
	public String edit(Model datos, @PathVariable("id") int id) 
	{
		List<Categoria> categorias= (List<Categoria>) caterepo.getCategorias();
		Noticia noti=servNoti.getNoticia(id);
		datos.addAttribute("noticia",noti);
		datos.addAttribute("categorias",categorias);
		datos.addAttribute("titulo", "Modificar");
		return "noticias/f_new";	
	}
	
	@GetMapping(value="borrar/{id}")
	public String destroy(Model datos, @PathVariable("id") int id) 
	{
		servNoti.deleteNoticia(id);
		return "redirect:/noticias/";
		
	}
	
}