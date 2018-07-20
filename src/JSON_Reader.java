import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class JSON_Reader {

    public static void main(String[] args) throws FileNotFoundException {
        InputStream fis = new FileInputStream("kout.json");

        JsonReader reader = Json.createReader(fis);

        JsonObject personObject = reader.readObject();

        reader.close();

        JsonArray elementArray = personObject.getJsonArray("element");
        for(int i = 0 ; i <= elementArray.size()-1; i++){
            double x = 0;
            System.out.println(elementArray.getJsonObject(i).getJsonNumber("offset"));
            x = elementArray.getJsonObject(i).getJsonNumber("offset").doubleValue();
            float y = (float) x;
            System.out.println(y);
        }

    }
}