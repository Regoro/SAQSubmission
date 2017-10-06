package com.thehit.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.thehit.interfaces.Singer;

public class SingerImpl extends Person implements Singer {

	Song song;
	
	
	public SingerImpl(String firstname, String lastname, int age, Song song){
		super(firstname, lastname,age);
		this.song=song;		
	}
	
	public SingerImpl(){
		super();
	
	}
	@Override
	public void perform(Song song) {
		// TODO Auto-generated method stub
		
	}

	public Song getSong() {
		return song;
	}

	@Autowired
	@Qualifier("song")
	public void setSong(Song song) {
		this.song = song;
		System.out.println("The Song is being Set");
	}

}
