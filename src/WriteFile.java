import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {

    public static void write(List<String> data) {
        File myFile = new File("src/data.txt");
        try {
            FileWriter out = new FileWriter(myFile);
            BufferedWriter writer = new BufferedWriter(out);
            for (String line : data) {
                writer.write(line);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
