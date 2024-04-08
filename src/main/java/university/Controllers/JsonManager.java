package university.Controllers;

import com.google.gson.Gson;
import university.Models.University;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JsonManager {
    private final Gson gson = new Gson();
    String filePath = "/src/main/resources/university.json";

    public void write(Object obj) {
        String jsonFromObj = writeToJson(obj);
        writeToFile(jsonFromObj);
    }

    public University read() {
        String json = readFromFile();
        return restoreFromJson(json);
    }

    public String writeToJson(Object obj) {
        return gson.toJson(obj);
    }

    public University restoreFromJson(String json) {
        return gson.fromJson(json, University.class);
    }

    public void writeToFile(String json) {
        try {
            PrintWriter writer = new PrintWriter(filePath, StandardCharsets.UTF_8);
            writer.printf(json);
            writer.close();
        } catch (IOException e) { System.out.println("Json hasn't been written due to an error:\n" + e.getMessage()); }
        System.out.println("\nJson has benn written to " + filePath);
    }

    public String readFromFile() {
        StringBuilder json = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
            reader.close();
        } catch (IOException e) { System.out.println("Json hasn't been read due to an error:\n" + e.getMessage()); }
        return json.toString();
    }
}
