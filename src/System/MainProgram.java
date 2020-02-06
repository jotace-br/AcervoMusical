package System;

import controller.ISongController;
import controller.SongController;
import model.Genre;
import model.Song;

public class MainProgram {
	public static void main(String[] args) {
		SongController SC = new SongController();
		
		ISongController musica1 = new Song("nothing else matters");
		
		SC.addSong(musica1);
		
		SC.listMusic();
		
	
	}
}
