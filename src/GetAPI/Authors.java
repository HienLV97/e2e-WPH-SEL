package GetAPI;

import Support.Constants;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Authors {

    public static void main(String[] args) {
        Constants constants = new Constants();
        String apiUrl = constants.YetiCMS;
        String token = constants.YetiCMSToken;
        String query = "{" +
                " authors(page: 1, first: 10) {" +
                "data {" +
                "id" +
                "   url" +
                "   meta_title" +
                "   meta_description  " +
                "} " +
                "}" +
                "}";
        String response = fetchGraphQL(apiUrl, token, query);
        JSONObject jsonObject = new JSONObject(response);
        String filePath = "Test-output/FileJson/Authors.json";
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
