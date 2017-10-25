package com.example.cti.musicplayer;

/**
 * Created by Cti on 25/10/2017.
 */

public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtists){
        id = songID;
        title = songTitle;
        artist = songArtists;
    }
    public long getId(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
}
