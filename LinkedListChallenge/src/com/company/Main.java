package com.company;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        //CREATE AN ALBUM
        Album album = new Album("Beautiful Mistakes", "Maroon 5");
        album.addSong("Lost", 4.6); //added songs to the album
        album.addSong("Echo", 4.22);
        album.addSong("Beautiful mistakes", 4.3);
        album.addSong("Sugar", 5.6);
        album.addSong("Harder", 3.21);
        album.addSong("Payphone", 6.23);
        album.addSong("Wait", 4.27);
        album.addSong("Turn me on", 4.2);
        album.addSong("Memories", 3.13);
        albums.add(album); //ADDED FIRST ALBUM TO ARRAYLIST OF ALBUMS

        //CREATED 2ND ALBUM
        Album album2 = new Album("Midnight Train", "Sauti Sol");
        album2.addSong("Midnight train", 4.6); //added songs to the album
        album2.addSong("Insecure", 4.22);
        album2.addSong("Sober", 4.3);
        album2.addSong("Suzanna", 5.6);
        album2.addSong("Tujiangalie", 3.21);
        album2.addSong("African Star", 6.23);
        album2.addSong("Melanin", 4.27);
        album2.addSong("Nairobi", 4.2);
        album2.addSong("Niko sawa", 3.13);
        albums.add(album2);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Beautiful mistakes", playList);
        albums.get(0).addToPlayList("Sugar", playList);
        albums.get(0).addToPlayList("Stay", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);


    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> songListIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + songListIterator.next().toString());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist is complete");
                    quit = true;
                    break;
                case 1:
                    // move to the next song
                    if (!forward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        forward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now playing " + songListIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    // move to the next song
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        forward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing " + songListIterator.previous().toString());
                    } else {
                        System.out.println("We reached the start  of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(songListIterator.hasPrevious()){
                            System.out.println("Now replaying " + songListIterator.previous());
                            forward=false;
                        }else {
                            System.out.println("We are at the start of the playlist");
                        }
                    }
                       else {
                        if (songListIterator.hasNext()) {
                            System.out.println("Now replaying " + songListIterator.next());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0){
                        songListIterator.remove();
                        if(songListIterator.hasNext()){
                            System.out.println("Now playing " + songListIterator.next());
                        }
                        else if(songListIterator.hasPrevious()){
                            System.out.println("Now playing " + songListIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("================================================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("================================================");
    }
    private static void printMenu(){
        System.out.println("Available actions :\npress");
        System.out.println("1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");
    }
}