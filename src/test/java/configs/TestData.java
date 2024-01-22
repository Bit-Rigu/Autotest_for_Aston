package configs;

public class TestData {

    private static final JsonFileReader reader = new JsonFileReader("testData.json");

    public static String getEmail() {
        return reader.getJsonNode("email").asText();
    }
}
