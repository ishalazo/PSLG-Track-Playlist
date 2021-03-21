import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ArrayList;

public class PlayList {
    private String playListName;
    private LinkedList<Track> playList; // LinkedList more efficient for inserting and deleting
    private static int playlistNum = 1; //static var that keeps track of how many play lists have been made
    private static LinkedList<String> allPlaylists = new LinkedList<String>(); // list of all playlists

    // Default constructor that sets the linked list, and playlist name
    public PlayList() {
        this.playListName = "My Playlist #" + playlistNum;
        playlistNum++;
        playList = new LinkedList<Track>();
    }

    //Set passed string as playlist name
    public PlayList(String playListName) {
        this.playListName = playListName;
        playList = new LinkedList<Track>();
        allPlaylists.add(playListName);
    }

    // add a Track object into the playlist
    public void add(Track t) {
        playList.add(t);
    }

    // add a Track object with specified title and artist
    public void add(String title, String artist) {
        playList.add(new Track(title, artist));
    }

    // add a Track object with specified title, artist, year and duration in seconds
    public void add(String title, String artist, int year, int duration) {
        playList.add(new Track(title, artist, year, duration));
    }


    //play all the tracks in sequence or randomly
    public void playAll(boolean random) {
        if (random) {
            ArrayList<Track> playlistCopy = new ArrayList<Track>(playList);
            while (playlistCopy.size() > 0) {
                int pos = (int) (Math.random() * playlistCopy.size());
                System.out.println(playlistCopy.get(pos));
                playlistCopy.remove(pos);
            }
        } else {
            for (Track t : playList) {
                System.out.println(t);
            }
        }
    }

    //print out all Track information inside current playlist
    public void showList(String order) {
        if (playList.isEmpty()) {
            System.out.println("The list is empty");
        }
    }
}