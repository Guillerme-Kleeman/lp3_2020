package peliculas.controller;

import org.springframework.ui.Model;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import peliculas.model.HibernateUtil;
import peliculas.model.Peliculas;
import peliculas.service.PeliculasService;

@Controller
public class PeliculasController {
	
	@Resource(name = "peliculasService")
	private PeliculasService peliculasService;
	
	@GetMapping(value="/")
	public String formulario(Model model) {
		String[] generos = { "Accion", "No accion" };
		model.addAttribute("nuevaPelicula", new Peliculas());
		model.addAttribute("generos", generos);
		return "formulario";
	}
	
	@PostMapping(value="guardar")
	public String guardar(Peliculas nuevaPelicula, Model model) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(nuevaPelicula);
        session.getTransaction().commit();
        Iterable<Peliculas> peliculas = peliculasService.listarPeliculas();
        model.addAttribute("peliculas", peliculas);
        return "listado";
	}
}
