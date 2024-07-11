import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> read(String data){
        List<String> list = new ArrayList<String>();
        File myFile = new File(data);
        try {
            FileReader out = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(out);

            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
