package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.Pagina;
import service.BuscadorService;

@Controller
public class BuscadorController {

	@Autowired // Inyecta una instancia de tipo BuscadorService
	BuscadorService buscador;

	@GetMapping(value = "Buscador")
	// Con RequestParam se hace como con el servlet, el valor se pone en tematica
	public String buscar(@RequestParam("tematica") String tematica, HttpServletRequest request) {
		List<Pagina> paginas = buscador.buscar(tematica);
		request.setAttribute("paginas", paginas);
		return "listado"; // manda al listado.jsp, spring sabe donde ir
	}

	/*@PostMapping(value = "Insertar")
	public String insertar(@RequestParam("url") String direccion, @RequestParam("tematica") String tematica, @RequestParam("desc") String descripcion) {
		Pagina pagina = new Pagina(direccion, tematica, descripcion);
		buscador.insertar(pagina);
		return "insertarPagina";
	}*/
	
	//Otra forma de añadir una pagina sin poner @RequestParam
	@PostMapping(value = "Insertar")
	public String insertar(@ModelAttribute Pagina pagina) {
		buscador.insertar(pagina);
		return "insertarPagina";
	}
	
}
