package adapter;

import java.io.*;

public class Utils {

    public static String translateFileToString(String filePath) throws IOException {
        String line;

        InputStream inputStream = new FileInputStream(new File(filePath));
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }

        reader.close();
        return builder.toString();
    }

}
