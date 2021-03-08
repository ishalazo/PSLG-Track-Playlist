import java.util.LinkedList;
import java.util.ArrayList;

public class PlayList{
	private String playListName;
	private LinkedList<Track> playList; // LinkedList more efficient for inserting and deleting
	private static int playlistNum = 1; //static var that keeps track of how many play lists have been made
	private static LinkedList<String> allPlaylists = new LinkedList<String>(); // list of all playlists

	// Default constructor that sets the linked list, and playlist name 
	public PlayList(){
		this.playListName = "My Playlist #" + playlistNum;
		playlistNum++;
		playList = new LinkedList<Track>();
	}

	//Set passed string as playlist name
	public PlayList(String playListName){
		this.playListName = playListName;
		playList = new LinkedList<Track>();
		allPlaylists.add(playListName);
	}

	/* Rename a playlist to a newPlayListName
	* if a playlist by this name already exists, add a version number at the end to distinguish the different playlists
	* e.g playlist 'Summer' exists and if you add another playlist called 'Summer' it will be changed to 'Summer1'
	*/
	public void setPlayListName(String newPlayListName){
		if(allPlaylists.contains(newPlayListName))
		{
			int version = 0;
			for(String title: allPlaylists)
			{
				if(title.startsWith(newPlayListName))
				{
					version++;
				}
			}
			allPlaylists.remove(playListName);
			this.playListName = newPlayListName + version;
		}
		else
		{
			allPlaylists.remove(playListName);
			this.playListName = newPlayListName;
		}

		allPlaylists.add(newPlayListName);
	}

	// returns the name of the current playlist
	public String getPlayListName(){
		return playListName;
	}

	// add a Track object into the playlist
	public void add(Track t){
		playList.add(t);
	}

	// add a Track object with specified title and artist
	public void add(String title, String artist){
		playList.add(new Track (title,artist));
	}

	// add a Track object with specified title, artist, year and duration in seconds
	public void add(String title, String artist, int year, int duration){
		playList.add(new Track (title,artist,year,duration));
	}
	
	//remove a Track from the playlist with the specified title
	public void remove(String title){
		for(Track t: playList)
		{
			if(t.getTitle().equalsIgnoreCase(title))
			{
				playList.remove(t); break;
			}
		}
	}

	//play all the tracks in sequence or randomly
	public void playAll(boolean random){
		if(random)
		{
			ArrayList<Track> playlistCopy = new ArrayList<Track>(playList);
			while(playlistCopy.size() > 0){ 
				int pos = (int)(Math.random()*playlistCopy.size());
				System.out.println(playlistCopy.get(pos));
				playlistCopy.remove(pos);
			}
		} else {
			for(Track t: playList)
			{
				System.out.println(t);
			}
		}
	}

	//play all Tracks by a given artist
	public void playOnly(String artist){
		for(Track t : playList)
		{
			if(t.getArtist().equalsIgnoreCase(artist))
			{
				System.out.println(t);
			}
		}
	}

	//play all Tracks released on a specified year
	public void playOnly(int year){
		for(Track t : playList)
		{
			if(t.getYear() == year)
			{
				System.out.println(t);
			}
		}
	}

	public String toString(){
		return playList.toString();
	}
	
	//print out all Track information inside current playlist
	public void showList(){
		if(playList.isEmpty())
		{   
			System.out.println("The list is empty");
		}
		else
		{
			System.out.println(playListName);
			playAll(false);
		}
	}
}