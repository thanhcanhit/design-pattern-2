package adapter_pattern;

public class JSONSystem implements JSON {
    private final String data;

    public JSONSystem(String data) {
        this.data = data;
    }

    @Override
    public void send(String json) {
        System.out.println("Sending JSON data: " + json);
    }
}
