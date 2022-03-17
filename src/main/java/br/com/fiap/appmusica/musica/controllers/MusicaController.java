package br.com.fiap.appmusica.musica.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.fiap.appmusica.musica.model.Musica;

@Controller
public class MusicaController {
	
	@GetMapping ("/musicas")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("musicas/index");
		Musica musica1 = new Musica(new Long (1), "Rihanna", "Need Me", "Anti");
		Musica musica2 = new Musica(new Long (2), "Rihanna", "Kiss it Better", "Anti");
		Musica musica3 = new Musica(new Long (3), "Sandy&Junior", "Inesquecível", "Sonho Azul");
		
		
		List<Musica> musicas = Arrays.asList(musica1, musica2, musica3);
		modelView.addObject("listarMusicas", musicas);
		
		return modelView;
	}

}
