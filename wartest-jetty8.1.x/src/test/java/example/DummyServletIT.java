package example;

import static org.junit.Assert.assertTrue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.Test;

public class DummyServletIT {

    @Test
    public void getHelloWorld() throws IOException {
        final String response = getHTML("http://localhost:8080/wartest/");
        assertTrue(response.contains("Hello"));
    }

    private static String getHTML(final String urlToRead) throws IOException {
        final StringBuilder result = new StringBuilder();
        final URL url = new URL(urlToRead);
        final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }

}
