
public class Electron extends Music {

    Double acoustic;


    public Electron(String title, String artist, String genre, double duration, Double acoustic) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
        this.acoustic = acoustic;
    }

    public String listen() {
        String s = "You listen to " + this.title + " by " + this.artist + "!";
        return s;
    }


}