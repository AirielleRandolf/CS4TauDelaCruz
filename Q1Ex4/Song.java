package Ex03TauDelaCruz;

public class Song {
    private String name;
    private Album albumFrom;
    private int streams;
    
    // constructors
    
    public Song(String name, Album partOfAlbum, int streams) {
        this.name = name;
        this.albumFrom = partOfAlbum;
        this.streams = streams;
    }
    
    // accessors
    
    public String getName() {
        return name;
    }
    
    public Album getAlbumFrom() {
        return albumFrom;
    }
    
    public int getStreams() {
        return streams;
    }
}
