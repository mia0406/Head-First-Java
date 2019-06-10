package com.mia.sixteen.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.mia.sixteen.datastructure.Song;

public class Jukebox5 {
	
	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		
		new Jukebox5().go();	
	}
	
	class ArtistCompare implements Comparator<Song>{
		
		public int compare(Song one, Song two) {
			return one.getArtist().compareTo(two.getArtist());
		}
	}
	
	public void go() {
		
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, artistCompare);
		
		System.out.println(songList);
	}
	
	void getSongs() {
		
		addSong("Pink Moon/Nick Drake/5/80");
		addSong("Somersault/Zero/4/84");
		addSong("Circles/YT/5/110");
		addSong("Passenger/Headmiz/4/100");
	}
	
	void addSong(String lineToParse) {
		
		String[] tokens = lineToParse.split("/");
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
}
