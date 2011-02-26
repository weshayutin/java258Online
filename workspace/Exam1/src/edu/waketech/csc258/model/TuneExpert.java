package edu.waketech.csc258.model;


/**
 * WES HAYUTIN
 * @author whayutin
 *
 */
public class TuneExpert {
	
	public Song getSong(String songName){
		Song mySong = new Song();
		mySong.setSongName(songName);
		
		if(songName == null){
			System.out.println("song name is null");
			return mySong;
		}
		
		if(mySong.getSongName().equalsIgnoreCase("Hound Dog"))
			mySong.setSingerName("Elvis");
		else if(mySong.getSongName().equalsIgnoreCase("Changes In Latitudes, Changes In Attitudes"))
			mySong.setSingerName("Jimmy Buffet");
		else if(mySong.getSongName().equalsIgnoreCase("Cheeseburger In Paradise"))
			mySong.setSingerName("Jimmy Buffet");
		else{
			System.out.println("SONG IS NOT RECONGNIZED");
			mySong.setSingerName(null);
		}
		return mySong;
	}

}
