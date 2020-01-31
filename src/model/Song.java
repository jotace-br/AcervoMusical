package model;
import interfaces.ISong;

public class Song implements ISong {
	private String SongName;
	private Album album;
	private Artist artist;
	
	public Song(String songName, Album album, Artist artist) {
		super();
		SongName = songName;
		this.album = album;
		this.artist = artist;
	}

	public String getSongName() {
		return SongName;
	}

	public void setSongName(String songName) {
		SongName = songName;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}	
	
}
