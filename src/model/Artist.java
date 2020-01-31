package model;

import interfaces.IArtist;

public class Artist extends Person implements IArtist {
	private String ArtisticName;
	private Genre genre;
	private String ArtistOverview;

	public Artist(String name, int age, String artisticName, Genre genre, String artistOverview) {
		super(name, age);
		ArtisticName = "Artista desconhecido";
		this.genre = Genre.UNKNOWN;
		ArtistOverview = "Um artista preguiçoso, ele não escreveu nada sobre ele!";
	}


	public String getArtisticName() {
		return ArtisticName;
	}


	public void setArtisticName(String artisticName) {
		ArtisticName = artisticName;
	}

	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public String getArtistOverview() {
		return ArtistOverview;
	}


	public void setArtistOverview(String artistOverview) {
		ArtistOverview = artistOverview;
	}
	
	

}
