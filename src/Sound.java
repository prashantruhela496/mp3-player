import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class Sound {

    public static void main(String arg[]) {
        try {
            FileInputStream file = new FileInputStream("D:\\JavaProjects\\PlayingAudio\\1.mp3");
            Player playMP3 = new Player(file);
            playMP3.play();
        } catch (Exception e) {
        }
    }
}