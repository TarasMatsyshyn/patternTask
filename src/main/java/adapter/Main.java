package adapter;

import static adapter.JsonToXmlAdapter.adaptJsonStringToXml;
import static adapter.Utils.translateFileToString;

import java.io.IOException;

public class Main {
    private static final String jsonTransportDroidPath = "/transportDroid.json";
    private static final String xmlBattleDroidPath = "/battleDroid.xml";

    public static void main(String[] args) throws IOException {

        /**
         * Method getDroidInfo() works only with 'xml' files
         * In project implemented adapter witch adapt 'json' file to xml format
         */

        DroidScanner droidScanner = new DroidScanner();

        String battleDroidInfo = droidScanner.getDroidInfo(translateFileToString(xmlBattleDroidPath)).toString();
        System.out.println(battleDroidInfo);

        String transportDroidInfo = droidScanner.getDroidInfo(adaptJsonStringToXml(translateFileToString(jsonTransportDroidPath))).toString();
        System.out.println(transportDroidInfo);
    }
}
