package adapter_pattern;

public class XMLSystem implements XML {

    @Override
    public String recive(String xml) {
        System.out.println("Receiving XML data: " + xml);
        return xml;
    }

}
