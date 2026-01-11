
public class Electron extends Music {

public static void main(String[] args) {
    
}
    Double acoustic;
    boolean electronics;

    public Electron(String title, String artist, String genre, double duration, Double acoustic, boolean electronics) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
        this.acoustic = acoustic;
        this.electronics = electronics;
    }

    public String listen() {
        String s = "You listen to " + this.title + " by " + this.artist + "!";
        return s;
    }


}