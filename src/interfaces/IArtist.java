package interfaces;

import model.Genre;

public interface IArtist extends IPerson {
	String getArtisticName();
	void setArtisticName(String artisticName);
	Genre getGenre();
	void setGenre(Genre genre);
	String getArtistOverview();
	void setArtistOverview(String artistOverview);
}
