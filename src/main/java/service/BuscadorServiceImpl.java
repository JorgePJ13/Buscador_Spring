package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import model.Pagina;

@Service // hace que Spring cree una instancia de la clase
public class BuscadorServiceImpl implements BuscadorService {
	ArrayList<Pagina> paginas = new ArrayList<>();

	public BuscadorServiceImpl() {
		paginas.add(new Pagina("http://www.fnac.es", "libros", "Libros y más cosas"));
		paginas.add(new Pagina("http://www.gamer.es", "juegos", "Juegos on-line"));
		paginas.add(new Pagina("http://www.casadellibro.es", "libros", "La Web de los libros"));
		paginas.add(new Pagina("http://www.mydisc.es", "musica", "Música de todo tipo"));
		paginas.add(new Pagina("http://www.radio.es", "musica", "Música de actualidad"));
	}

	// bucamos las páginas cuya temática coincida con la recibida como parámetro
	public List<Pagina> buscar(String tematica) {
		// en este arraylist auxiliar guardamos las páginas
		// cuya temática coincida con la recibida como parámetro
		/*
		 * List<Pagina> auxiliar=new ArrayList<>(); for(int i=0;i<paginas.size();i++) {
		 * Pagina pagina=paginas.get(i); if(pagina.getTematica().equals(tematica)) {
		 * auxiliar.add(pagina); } } return auxiliar;
		 */

		// Programacion funcional
		return paginas.stream().filter(p -> p.getTematica().equals(tematica)).collect(Collectors.toList());
	}
	
	@Override
	public void insertar(Pagina p) {
		paginas.add(p);		
	}
}
