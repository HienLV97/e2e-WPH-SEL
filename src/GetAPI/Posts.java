package GetAPI;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Posts {
    public static void main(String[] args) {
        String apiUrl = "https://yeti-cms.dev/api";
        String token = "2b0c615afb1b72cf093a5fa6d48c7ef1";
        String query = "{" +
                "posts(page: 1, first: 1000) {" +
                "data {" +
                "id"+
                "  title" +
                "      url" +
                "      author" +
                "      meta_title" +
                "      meta_description  " +
                "} " +
                "}" +
                "}";
        String response = fetchGraphQL(apiUrl, token, query);
        JSONObject jsonObject = new JSONObject(response);
        String filePath = "Test-output/FileJson/Posts.json";
        try {
            // Tạo một đối tượng FileWriter để ghi dữ liệu vào tệp tin
            FileWriter writer = new FileWriter(filePath);

            // Ghi dữ liệu vào tệp tin
            writer.write(jsonObject.toString());

            // Đóng tệp tin sau khi ghi xong
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("done");
    }

    public static String fetchGraphQL(String apiUrl, String bearerToken, String graphqlQuery) {
        try {
            // Create the connection object and set the required HTTP method and headers
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + bearerToken);
            connection.setDoOutput(true);

            // Create the JSON request payload
            String jsonInputString = "{\"query\":\"" + graphqlQuery.replace("\"", "\\\"") + "\"}";

            // Write the JSON payload to the connection output stream
            try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
                outputStream.writeBytes(jsonInputString);
                outputStream.flush();
            }

            // Read the response from the input stream
            StringBuilder response = new StringBuilder();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                }
            } else {
                // If connection is not OK, read the error stream
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getErrorStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                }
            }

            // Disconnect the connection
            connection.disconnect();

            // Return the response
            return response.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
