package configs;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JsonFileReader {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final JsonNode root;

    public JsonFileReader(String fileName) {
        try {
            root = OBJECT_MAPPER.readTree(
                    new File(JsonFileReader.class
                            .getClassLoader()
                            .getResource(fileName)
                            .getPath()));
        } catch (Exception e) {
            throw new RuntimeException("Error reading file" + fileName);
        }
    }

    public JsonNode getJsonNode(String key) {
        return root.get(key);
    }
}
