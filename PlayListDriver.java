public class PlayListDriver{
    public static void main(String[]args){
        Track myTrack = new Track("Umbrella","Rihanna",2015,123);
        
        PlayList summerPlayList = new PlayList("Summer");
        PlayList myList = new PlayList();
        PlayList songs = new PlayList();
        
        myList.add("Firework","Katy Perry",2001,110);
        myList.add("Baby","Justin Bieber",2001,145);
        myList.add("Break My Heart","Dua Lipa",2020,125);
        myList.add("Disturbia","Rihanna",2005,145);
        myList.add(myTrack);
        myList.showList();
        
        summerPlayList.add("Teenage Dream","Katy Perry",2001,160);
        summerPlayList.add("Closer","Chainsmokers",2009,90);
        summerPlayList.add("Nostalgia","Busted",2016,88);
        summerPlayList.add("The One that Got Away","Katy Perry");
        summerPlayList.add(myTrack);
        summerPlayList.showList();
        
        songs.add("Shape of You","Ed Sheeran",2011,189);
        songs.add("Galway Girl","Ed Sheeran",2014,160);
        songs.add("Sucker","Jonas Brothers",2019,130);
        songs.add("Graveyard","Halsey");
        songs.add(myTrack);
        songs.showList();
        
        System.out.println("Remove song 'Baby' from Default PlayList 1");
        myList.remove("baby");
        myList.showList();
        
        System.out.println("Playing 'Summer' in order");
        summerPlayList.playAll(false);
        System.out.println();
        System.out.println("Play 'Summer'randomly");
        summerPlayList.playAll(true);
        
        System.out.println();
        System.out.println("Renaming Default List 2 to 'Pop'");
        songs.setPlayListName("Pop");
        System.out.println();
        songs.showList();
        
        System.out.println("Play songs only from 2001 in Default PlayList 1");
        myList.playOnly(2001);
        System.out.println();
        System.out.println("Play songs only by the Artist 'Ed Sheeran' in playlist 'Pop'");
        songs.playOnly("ed sheeran");
        
    }
    
}