import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class test {


    @Test(groups = {"Sanity"})
    public void result2() throws IOException {
        System.out.println("result");
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("src/main/resources/data.properties");

        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        prop.setProperty("browser","chrome");
        FileOutputStream fos=new FileOutputStream("src/main/resources/data.properties");
        prop.store(fos,null);
        System.out.println(prop.getProperty("browser"));

    }
}
