package Ex03TauDelaCruz;

public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private Album favoriteAlbum;
    private static int totalPerformances;
    
    // constructors
    
    public Singer(String name, int noOfPerformances, double earnings) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
    }
    
    // main methods
    
    public void performForAudience(int noOfPeople, double ticketCost) {
        noOfPerformances++;
        totalPerformances++;
        earnings += noOfPeople * ticketCost;
    }
    
    public void performForAudience(int noOfPeople, double ticketCost, Singer partnerSinger) {
        this.noOfPerformances++;
        partnerSinger.noOfPerformances++;
        totalPerformances += 2; // 2 is added to account for 2 singers performing
        this.earnings += noOfPeople * ticketCost / 2.0;
        partnerSinger.addEarnings(noOfPeople * ticketCost / 2.0);
    }
    
    // accessors
    
    public static int getTotalPerformances() {
        return totalPerformances;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public String getName() {
        return name;
    }
    
    public Song getFavoriteSong() {
        return favoriteSong;
    }
    
    public Album getFavoriteAlbum() {
        return favoriteAlbum;
    }
    
    // mutators
    
    public void changeFavSong(Song newFavorite) {
        favoriteSong = newFavorite;
    }
    
    public void changeFavAlbum(Album newFavorite) {
        favoriteAlbum = newFavorite;
    }
    
    public void addEarnings(double earnings) {
        this.earnings += earnings;
    }
}
