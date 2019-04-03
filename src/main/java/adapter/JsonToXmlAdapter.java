package adapter;


import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;

public class JsonToXmlAdapter {

    public static String adaptJsonStringToXml(String jsonString) throws IOException {
        JSONObject json = new JSONObject(jsonString);
        return XML.toString(json);
    }
}
