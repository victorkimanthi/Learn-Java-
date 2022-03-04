package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
        private String albumName;
       private String albumArtist;
        private ArrayList<Song> songs;

        public Album(String albumName, String albumArtist) {
            this.albumName = albumName;
            this.albumArtist = albumArtist;
            this.songs = new ArrayList<Song>();
        }
        public boolean addSong(String songTitle, double songDuration){
            if(findSong(songTitle) == null){
                this.songs.add(new Song(songTitle,songDuration));
                return  true;
            }
            return false;
        }
        private Song findSong(String songTitle) {
            for (Song checkedSong: this.songs) {
                if(checkedSong.getSongTitle().equals(songTitle)){
                    return checkedSong;
                }
            }
            return null;
        }
        public boolean addToPlayList(int trackNumber , LinkedList <Song> playlist){
            int index = trackNumber-1;
            if((index >=0) && (index <= this.songs.size())){
                playlist.add(this.songs.get(index));
                 return true;
            }
            System.out.println("This album does not have track " + trackNumber);
            return  false;
        }
       public boolean addToPlayList(String title , LinkedList <Song> playlist) {
          Song checkedSong=findSong(title);
          if(checkedSong != null){
              playlist.add(checkedSong);
              return true;
          }
           System.out.println("The song " + title + " not found in album");
          return  false;
       }

    }

