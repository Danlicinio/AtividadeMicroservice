package br.com.fiap.appmusica.musica.model;




public class Musica {
private Long id;
private String cantor;
private String musica;
private String album;



public Musica() {
	
}

//construtor com mesmos parâmetros dos próprios atributos das classes acima
public Musica(Long id, String cantor, String musica, String album) {
	super();
	this.id = id;
	this.cantor = cantor;
	this.musica = musica;
	this.album = album;
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCantor() {
	return cantor;
}

public void setCantor(String cantor) {
	this.cantor = cantor;
}

public String getMusica() {
	return musica;
}

public void setMusica(String musica) {
	this.musica = musica;
}

public String getAlbum() {
	return album;
}

public void setAlbum(String album) {
	this.album = album;
}


}
