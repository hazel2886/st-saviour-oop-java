
public class Acoustic extends Music {

    int bpm;

    public Acoustic(String title, String artist, String genre, double duration, int bpm) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
        this.bpm = bpm;
    }

    public String listen() {
        String s = "You listen to " + this.title + " by " + this.artist + "!";
        return s;
    }


}