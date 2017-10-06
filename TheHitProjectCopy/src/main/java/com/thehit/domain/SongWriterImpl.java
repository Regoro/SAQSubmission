package com.thehit.domain;

import com.thehit.interfaces.Songwriter;

public class SongWriterImpl extends Person implements Songwriter  {
	  
	   Song song;
		
		   
		   public SongWriterImpl() {
			   super();
			   System.out.println("Here we are in the default constructor");
		   }

		   
	   public SongWriterImpl(String firstname, String lastname, int age, Song song) {
		   super(firstname, lastname, age);
			this.song = song;
			System.out.println(firstname + lastname + song +age);
			System.out.println("fistname: "+ firstname +" lastname: "+ lastname +" age: " + age
					+" song name: "+ song.getName() + " song lyrics: "+ song.getLyrics());
		}



	public Song getSong() {
		return song;
	}


	public void setSong(Song song) {
		this.song = song;
	}





	@Override
	public String toString() {
		return "SongWriterImpl [firstname=" + firstname + ", lastname=" + lastname + ", song=" + song + ", age=" + age
				+ "]";
	}


	@Override
	public void compose(com.thehit.domain.Song song) {
		System.out.println("Composer " + "name" + " composed a song called " + song.getName() +". This song has the following lyrics "+ song.getLyrics());

		
	}






}