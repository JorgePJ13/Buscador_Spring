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
		paginas.add(new Pagina("http://www.fnac.es", "libros", "Libros y m�s cosas"));
		paginas.add(new Pagina("http://www.gamer.es", "juegos", "Juegos on-line"));
		paginas.add(new Pagina("http://www.casadellibro.es", "libros", "La Web de los libros"));
		paginas.add(new Pagina("http://www.mydisc.es", "musica", "M�sica de todo tipo"));
		paginas.add(new Pagina("http://www.radio.es", "musica", "M�sica de actualidad"));
	}

	// bucamos las p�ginas cuya tem�tica coincida con la recibida como par�metro
	public List<Pagina> buscar(String tematica) {
		// en este arraylist auxiliar guardamos las p�ginas
		// cuya tem�tica coincida con la recibida como par�metro
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
