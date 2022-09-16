package Ex03TauDelaCruz;

public class Song {
    String name;
    Album partOfAlbum;
    int streams;
    
    public Song(String name, Album partOfAlbum, int streams) {
        this.name = name;
        this.partOfAlbum = partOfAlbum;
        this.streams = streams;
    }
}
