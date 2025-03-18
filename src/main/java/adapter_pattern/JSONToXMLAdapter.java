package adapter_pattern;

public class JSONToXMLAdapter implements  JSON {
    private final XML xmlData;

    public JSONToXMLAdapter(XML xmlData) {
        this.xmlData = xmlData;
    }

    public String JSONToXML(String json) {
        System.out.println("Transforming JSON to XML...");
        String xml = json.replace("{", "<").replace("}", ">").replace(":", "=");

        return xml;
    }


    @Override
    public void send(String json) {
        System.out.println("Sending JSON data: " + json);
        String xml = JSONToXML(json);
        xmlData.recive(xml);
    }
}
