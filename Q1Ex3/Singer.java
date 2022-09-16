package Ex03TauDelaCruz;

public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    Album favoriteAlbum;
    
    public Singer(String name, int noOfPerformances, double earnings) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
    }
    
    public void performForAudience(int noOfPeople, double ticketCost) {
        noOfPerformances++;
        earnings += noOfPeople * ticketCost;
    }
    
    public void changeFavSong(Song newFavorite) {
        favoriteSong = newFavorite;
    }
    
    public void changeFavAlbum(Album newFavorite) {
        favoriteAlbum = newFavorite;
    }
}
