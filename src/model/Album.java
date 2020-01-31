package model;

import java.util.List;

import interfaces.ISong;

public class Album {
	private String albumName;
	private int albumYear;
	private Genre genre;
	private Artist artist;
	private List<ISong> Songs;
	
	public Album(String albumName, int albumYear, Genre genre, Artist artist, List<ISong> songs) {
		super();
		this.albumName = albumName;
		this.albumYear = albumYear;
		this.genre = genre;
		this.artist = artist;
		Songs = songs;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public int getAlbumYear() {
		return albumYear;
	}

	public void setAlbumYear(int albumYear) {
		this.albumYear = albumYear;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public List<ISong> getSongs() {
		return Songs;
	}

	public void setSongs(List<ISong> songs) {
		Songs = songs;
	}	
	
}
