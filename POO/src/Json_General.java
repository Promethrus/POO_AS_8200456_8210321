import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Json_General {

    public void SpeakerJsonFile(){
        File directory = new File("temp/gui");
        if (!directory.exists()) directory.mkdirs();
        try {
            FileWriter file = new FileWriter("temp/gui/test.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
