package q1ex1;

public class Q1Ex1 {

    public static void main(String[] args) {
        /* VARIABLES */
        String tpab = "To Pimp A Butterfly";
        String tpabGenre = "Hip-hop";
        int tpabLength = 16;
        
        System.out.println("Album 1");
        System.out.println("Name: " + tpab);
        System.out.println("Genre: " + tpabGenre);
        System.out.println("Length: " + tpabLength + " tracks\n");
        
        String ah = "After Hours";
        String ahGenre = "R&B";
        int ahLength = 14;
        
        System.out.println("Album 2");
        System.out.println("Name: " + ah);
        System.out.println("Genre: " + ahGenre);
        System.out.println("Length: " + ahLength + " tracks\n");
        
        String ksg = "KIDS SEE GHOSTS";
        String ksgGenre = "Hip-hop";
        int ksgLength = 7;
        
        System.out.println("Album 3");
        System.out.println("Name: " + ksg);
        System.out.println("Genre: " + ksgGenre);
        System.out.println("Length: " + ksgLength + " tracks\n");
        
        System.out.printf("Total track-length of all albums: %d // (operation: sum)\n", tpabLength + ahLength + ksgLength);
        System.out.printf("\"KIDS SEE GHOSTS\" has more tracks than \"After Hours\": %b // (operation: comparison)\n", ksgLength > ahLength);
        System.out.printf("\"To Pimp A Butterfly\" has the same genre as \"KIDS SEE GHOSTS\": %b // (operation: comparison)\n", tpabGenre == ksgGenre);
    }
    
}
