package com.mia.sixteen.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.mia.sixteen.datastructure.Song;

public class Jukebox6 {

ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		
		new Jukebox6().go();	
	}

	public void go() {
		
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
	}
	
	void getSongs() {
		
		addSong("Pink Moon/Nick Drake/5/80");
		addSong("Somersault/Zero/4/84");
		addSong("Circles/YT/5/110");
		addSong("Passenger/Headmiz/4/100");
		addSong("Passenger/Headmiz/4/100");
	}
	
	void addSong(String lineToParse) {
		
		String[] tokens = lineToParse.split("/");
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}	
}
