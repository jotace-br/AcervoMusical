package model;
import controller.ISongController;
import interfaces.ISong;

public class Song implements ISong, ISongController {
	private String songName;
	private Album album;
	private Artist artist;
	
	public Song(String songName, Album album, Artist artist) {
		this.songName = songName;
		this.album = album;
		this.artist = artist;
	}
	
	public Song(String songName, Album album) {
		this.songName = songName;
		this.album = album;
	}
	
	public Song(String songName) {
		this.songName = songName;
	}

	public String getSongName() {
		return songName;
	}

	public boolean setSongName(String songName) {
		this.songName = songName;
		return true;
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
	
	public String getSong() {
		return songName;
	}
	
	@Override
	public String setSongName(String songName) {
		return this.songName = songName;
	}
}
