package Ex03TauDelaCruz;

public class Album {
    String name;
    Singer artist;
    String genres;
    int length;
    
    public Album(String name, Singer artist, String genres, int length) {
        this.name = name;
        this.artist = artist;
        this.genres = genres;
        this.length = length;
    }
}
