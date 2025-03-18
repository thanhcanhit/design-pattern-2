package adapter_pattern;

public class AdapterTest {
    public static void main(String[] args) {
        XML xml = new XMLSystem();
        String jsonData = "{\"name\": \"John\", \"age\": 30}";
//        XML System muốn nhận dữ liệu dạng JSON
        JSONToXMLAdapter adapter = new JSONToXMLAdapter(xml);

        adapter.send(jsonData);
    }
}
