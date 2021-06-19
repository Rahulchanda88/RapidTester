package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    Properties prop;
    FileReader reader;

    public void getReader() {

        try
        {
            reader = new FileReader("app.properties");
        } catch(FileNotFoundException e)

        {
            e.printStackTrace();
        }    prop=new Properties();
        try {
            prop.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
