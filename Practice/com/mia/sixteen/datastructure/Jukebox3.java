package com.mia.sixteen.datastructure;

import java.util.ArrayList;
import java.util.Collections;

public class Jukebox3 {
	
	ArrayList<Song> songList = new ArrayList<Song>();
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String[] args) {

		new Jukebox3().go();
		
		arr.add("bbb");
		arr.add("zzz");
		arr.add("aaa");
		arr.add("eee");
		
		//System.out.println(arr);
	}
	
	public void go() {
		
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
	}
	
	void getSongs() {
		
		addSong("Pink Moon/Nick Drake/5/80");
		addSong("Somersault/Zero/4/84");
		addSong("Circles/BT/5/110");
		addSong("Passenger/Headmiz/4/100");
		
	}
	
	void addSong(String lineToParse) {
	
		String[] tokens = lineToParse.split("/");
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
}
