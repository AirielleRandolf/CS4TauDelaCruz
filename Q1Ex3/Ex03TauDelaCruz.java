package Ex03TauDelaCruz;

public class Ex03TauDelaCruz {

    public static void main(String[] args) {
        Singer tyler = new Singer("Tyler, the Creator", 0, 1000.00);
        Album igor = new Album("IGOR", tyler, "Hip-Hop/Neo Soul/Synth Funk", 12);
        Song earfquake = new Song("EARFQUAKE", igor, 300);
        
        Singer kanye = new Singer("Kanye West", 5, 3000.00);
        Album donda = new Album("Donda", kanye, "Hip-Hop/Rap/RnB/Soul", 27);
        Song hurricane = new Song("Hurricane", donda, 20);
        
        Singer drake = new Singer("Drake", 0, 0.00);
        Album clb = new Album("Certified Lover Boy", drake, "Hip-Hop/Rap/RnB/Soul", 21);
        
        kanye.performForAudience(12, 100.00);
        kanye.changeFavSong(hurricane);
        kanye.changeFavAlbum(donda);
        
        tyler.performForAudience(80, 50.00);
        tyler.changeFavAlbum(clb);
        tyler.changeFavSong(earfquake);
        
        drake.performForAudience(0, 10000000.00);
    }
    
}
