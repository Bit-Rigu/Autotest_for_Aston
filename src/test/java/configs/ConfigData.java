package configs;

public class ConfigData {

    private static final JsonFileReader reader = new JsonFileReader("configData.json");

    public static String getUrl() {
        return reader.getJsonNode("url").asText();
    }

    public static int getDelayTime() {
        return reader.getJsonNode("delayTime").asInt();
    }
}
