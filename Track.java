public class Track { 
    private String title;
    private String artist;
    private int year;
    private int duration;

    public Track(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public Track(String title, String artist, int year, int duration){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = duration; 
    }

    //Format the Track information into
    // Title - Artist, Year [mm:ss]
    public String toString(){
    	
    }

    public boolean equals(Track other){
        return title.equalsIgnoreCase(other.getTitle());
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getArtist(){
        return artist;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }
}