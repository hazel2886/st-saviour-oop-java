public class Rock extends Music {

    boolean guitar;


    public Rock(String title, String artist, String genre, double duration, boolean guitar) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
        this.guitar = guitar;
    
        
    }

    public String listen() {
        String s = "You listen to " + this.title + " by " + this.artist + "!";
        return s;
    }


}