package interfaces;

import model.Album;
import model.Artist;

public interface ISong {
	String getSongName();
	boolean setSongName(String songName);
	Album getAlbum();
	void setAlbum(Album album);
	Artist getArtist();
	void setArtist(Artist artist);
	
	
}
