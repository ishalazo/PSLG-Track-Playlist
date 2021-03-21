public class PlayListDriver {
    public static void main(String[] args) {
        PlayList summerPlayList = new PlayList("Summer");

        //example of anon object being added to the playlist
        summerPlayList.add("Teenage Dream", "Katy Perry", 2001, 160);
        summerPlayList.add("Closer", "Chainsmokers", 2009, 90);
        summerPlayList.add("Nostalgia", "Busted", 2016, 88);
        summerPlayList.add("The One that Got Away", "Katy Perry");

        //example of named object being added
        Track myTrack = new Track("Umbrella", "Rihanna", 2015, 123);
        summerPlayList.add(myTrack);

        summerPlayList.showList("asc");
        System.out.println("");
        summerPlayList.showList("desc");
    }
}