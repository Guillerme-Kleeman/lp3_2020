package unae.lp3.notas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import unae.lp3.notas.model.Categoria;
import unae.lp3.notas.service.CategoriasServiceImpl;

@Controller
@RequestMapping(value="categorias")
public class CategoriaController {
	
	@Autowired 
	private CategoriasServiceImpl categoriasService;
	
	@GetMapping(value="/")	
	public String index(Model datos) 
	{
		String titulo="Todas las Categorias";
		datos.addAttribute("titulo",titulo);
		List<Categoria> categorias= categoriasService.getCategorias();
		datos.addAttribute("datos", categorias);
		return "categorias/index";
	}
	
	@PostMapping(value="guardar")
	public String save(Categoria categoria) 
	{
		categoriasService.saveCategoria(categoria);
		return "redirect:/categorias/";
	}
	
	@GetMapping(value="nuevo")
	public String add(Model datos) 
	{
		Categoria nuevaCategoria = new Categoria();
		datos.addAttribute("categoria", nuevaCategoria);
		datos.addAttribute("titulo", "Crear");
		return "categorias/f_new";	
	}
	
	@GetMapping(value="editar/{id}")
	public String edit(Model datos, @PathVariable("id") int id) 
	{
		Categoria categoria=categoriasService.getCategoria(id);
		datos.addAttribute("categoria",categoria);
		datos.addAttribute("titulo", "Modificar");
		return "categorias/f_new";	
	}
	
	@GetMapping(value="borrar/{id}")
	public String destroy(Model datos, @PathVariable("id") int id) 
	{
		categoriasService.deleteCategoria(id);
		return "redirect:/categorias/";
		
	}
	
}