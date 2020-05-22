package stuff;

import java.util.AbstractMap;

public class SampleClass  {

    private void helloWorld() {
        System.out.println("Hello World");
    }

    private void helloWorld(AbstractMap.SimpleEntry<String, String> entry) {
        System.out.println("Hello World " + entry.getKey() + ":" + entry.getValue());
    }
}
