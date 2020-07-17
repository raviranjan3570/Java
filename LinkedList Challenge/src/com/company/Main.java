package com.company;

import java.util.*;

public class Main {

    public static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Hybrid Theory", "Linkin Park");
        album.addSong("Papercut", 3.23);
        album.addSong("One Step Closer", 3.25);
        album.addSong("With You", 4.00);
        album.addSong("Points Of Authority", 3.53);
        album.addSong("Crawling", 3.14);
        album.addSong("Runaway", 3.13);
        album.addSong("By Myself", 3.03);
        albums.add(album);

        album = new Album("Meteora", "Linkin Park");
        album.addSong("Somewhere I Belong", 3.23);
        album.addSong("Lying From You", 3.25);
        album.addSong("Easier To Run", 4.00);
        album.addSong("Faint", 3.53);
        album.addSong("Figure.09", 3.14);
        album.addSong("Breaking The Habit", 3.13);
        album.addSong("From The Inside", 3.03);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlayList("Papercut", playlist);
        albums.get(0).addToPlayList("With You", playlist);
        albums.get(0).addToPlayList("Crawling", playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        play(playlist);
    }

    private static void play(LinkedList playlist) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {

            System.out.println("No songs in playlist");
        } else {

            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {

                case 0:
                    System.out.println("PlayList complete");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {

                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {

                        System.out.println("We have reached the end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {

                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {

                        System.out.println("We have reached the start of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {

                        if (listIterator.hasPrevious()) {
                            System.out.println("now replaying: " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("we are at the start of the list.");
                        }
                    } else {

                        if (listIterator.hasNext()) {
                            System.out.println("now replaying: " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("we are at the end of the list.");
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
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {

                            System.out.println("now playing: " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {

                            System.out.println("now playing: " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available action: \npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay current song\n" +
                "4 - to list the song in playlist\n" +
                "5 - print available actions\n" +
                "6 - remove song from playlist");
    }

    private static void printList(LinkedList<Song> playList) {

        Iterator<Song> iterator = playList.iterator();
        System.out.println("=========================");
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }
}