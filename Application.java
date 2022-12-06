import java.io.*;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {
        try {
            String configFilePath = "src/config.properties";
            FileInputStream propsInput = new FileInputStream(configFilePath);
            Properties prop = new Properties();
            prop.load(propsInput);

            Queue queue = new Queue(prop)
            queue.execute()
            Thread.sleep(1000);
            queue.shutdown()
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
