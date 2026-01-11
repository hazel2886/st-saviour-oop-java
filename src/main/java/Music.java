
public abstract class Music {
    
    String title;
    String artist;
    String genre;
    double duration;

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public String play(String sings) {
        return this.genre + "sings" + artist + "!";
    }
}