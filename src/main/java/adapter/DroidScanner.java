package adapter;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class DroidScanner {

    public DroidModel getDroidInfo(String xmlString) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        DroidModel droid = xmlMapper.readValue(xmlString, DroidModel.class);
        return droid;
    }

}
