package configs;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import java.io.BufferedReader;;
import java.io.FileReader;
import java.io.IOException;

public class ConfigJsonData {
    public String userData() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/java/testData/users.json"));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

    public String getUsername(int index) throws IOException {
        String userdata = userData();
        JSONArray usernameArray = JsonPath.read(userdata, "$.loginData..username");
        return (String) usernameArray.get(index);
    }

    public String getPassword(int index) throws IOException {
        String userdata = userData();
        JSONArray passwordArray = JsonPath.read(userdata, "$.loginData..password");
        return (String) passwordArray.get(index);
    }

    // This method fetches the message Json and convert it to java object

    public String messages() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/java/testData/messages.json"));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

    public String getTransport(int index) throws IOException {
        String messages = messages();
        JSONArray transportArray = JsonPath.read(messages, "$.message..transport");
        return (String) transportArray.get(index);
    }
    public String getContact(int index) throws IOException {
        String messages = messages();
        JSONArray contactArray = JsonPath.read(messages, "$.message..contact");
        return (String) contactArray.get(index);

    }
    public String getTrigger(int index) throws IOException {
        String messages = messages();
        JSONArray triggerArray = JsonPath.read(messages, "$.message..trigger");
        return (String) triggerArray.get(index);

    }
    public String getResponse(int index) throws IOException {
        String messages = messages();
        JSONArray responseArray = JsonPath.read(messages, "$.message..response");
        return (String) responseArray.get(index);
    }

    public String getResponse2(int index) throws IOException {
        String messages = messages();
        JSONArray response2Array = JsonPath.read(messages, "$.message..response2");
        return (String) response2Array.get(index);
    }

    // This method fetches the interaction data
        public String interactionData() throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/java/testData/interactions.json"));
            String line = null;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        }
    public String interactionName(int index) throws IOException {
        String interactionData = interactionData();
        JSONArray interactionNameArray = JsonPath.read(interactionData, "$.interaction..name");
        return (String) interactionNameArray.get(index);
    }
    public String interactionDescription(int index) throws IOException {
        String interactionData = interactionData();
        JSONArray interactionNameArray = JsonPath.read(interactionData, "$.interaction..description");
        return (String) interactionNameArray.get(index);
    }
    public String getSuccess(int index) throws IOException {
        String interactionData = interactionData();
        JSONArray interactionArray = JsonPath.read(interactionData, "$.interaction..success");
        return (String) interactionArray.get(index);
    }

    // This method fetches the projects data
    public String projectData() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/java/testData/projects.json"));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
    public String projectName(int index) throws IOException {
        String projectData = projectData();
        JSONArray projectNameArray = JsonPath.read(projectData, "$.projectData..projectName");
        return (String) projectNameArray.get(index);
    }
}
