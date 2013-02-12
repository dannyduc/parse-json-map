package sample;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

/**
 *
 * Sample code to parse JSON response from batch status API
 *
 * https://developer.ingenuity.com/datastream/api/v1/labcorp/datapackages/batch/84
 *
 *
 *
 */
public class ParseRequestedItems {

    public static void main(String[] args) throws IOException {
        String json = "{\n" +
                "  \"exportUrl\": \"https://developer.ingenuity.com/datastream/api/v1/labcorp/datapackages/batch/export/84\",\n" +
                "  \"requestedItems\": {\n" +
                "    \"testId001\": \"https://developer.ingenuity.com/v1/datapackages/DP_646790327\",\n" +
                "    \"testId002\": \"https://developer.ingenuity.com/v1/datapackages/DP_790930419\"\n" +
                "  },\n" +
                "  \"status\": \"DONE\"\n" +
                "}";

        System.out.println("JSON String: " + json);

        ObjectMapper mapper = new ObjectMapper();
        Map m = mapper.readValue(json, Map.class);

        System.out.println("Java Map: " + m);
    }
}
