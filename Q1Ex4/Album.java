package Ex03TauDelaCruz;

public class Album {
    private String name;
    private Singer artist;
    private String genres;
    private int length;
    
    // constructors
    
    public Album(String name, Singer artist, String genres, int length) {
        this.name = name;
        this.artist = artist;
        this.genres = genres;
        this.length = length;
    }
    
    // accessors
    
    public String getName() {
        return name;
    }
    
    public Singer getArtist() {
        return artist;
    }
    
    public String getGenres() {
        return genres;
    }
    
    public int getLength() {
        return length;
    }
}
