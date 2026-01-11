import java.util.ArrayList;

public class ClassicRock extends Rock {
    public static  ArrayList<ClassicRock>classicRockSong = new ArrayList<>();
    
    public ClassicRock(String title, String artist, String genre, double duration, boolean guitar) {
        super(title, artsit, genre, duration, guitar); 
    }
}
    public abstract String listen();
     return super.listen() + "This is a classic rock song."; {
     }

    public String solo()
        if (guitar) {
        return "Enjoy guitar solo" + title + "!"
    }else{
        return title + " doesn't have a guitar...";
    }