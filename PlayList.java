import java.util.LinkedList;
import java.util.ArrayList;

public class PlayList{
	private String playListName;
	private LinkedList<Track> playList; // LinkedList more efficient for inserting and deleting
	private static int playlistNum = 1; //static var that keeps track of how many play lists have been made
	private static LinkedList<String> allPlaylists = new LinkedList<String>(); // list of all playlists

	// Default constructor that sets the linked list, and playlist name 
	public PlayList(){
		
	}

	//Set passed string as playlist name
	public PlayList(String playListName){
		
	}

	/* Rename a playlist to a newPlayListName
	* if a playlist by this name already exists, add a version number at the end to distinguish the different playlists
	* e.g playlist 'Summer' exists and if you add another playlist called 'Summer' it will be changed to 'Summer1'
	*/
	public void setPlayListName(String newPlayListName){
		
	}

	// returnts the name of the current playlist
	public String getPlayListName(){
		return playListName;
	}

	// add a Track object into the playlist
	public void add(Track t){
		
	}

	// add a Track object with specified title and artist
	public void add(String title, String artist){
		
	}

	// add a Track object with specified title, artist, year and duration in seconds
	public void add(String title, String artist, int year, int duration){
		
	}
	
	//remove a Track from the playlist with the specified title
	public void remove(String title){
		for(Track t: playList)
		{
			if(t.getTitle().equalsIgnoreCase(title))
			{
				playList.remove(t);
			}
		}
	}

	//play all the tracks in sequence or randomly
	public void playAll(boolean random){
		
	}

	//play all Tracks by a given artist
	public void playOnly(String artist){
		
	}

	//play all Tracks released on a specified year
	public void playOnly(int year){
		
	}

	public String toString(){
		
	}
	
	//print out all Track information inside current playlist
	public void showList(){
		
	}
}