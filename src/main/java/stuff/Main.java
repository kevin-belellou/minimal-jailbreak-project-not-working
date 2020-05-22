package stuff;

import manifold.ext.api.Jailbreak;

import java.util.AbstractMap;

public class Main {

    public static void main(String[] args) {
        @Jailbreak SampleClass sample = new SampleClass();
        sample.helloWorld();
        sample.helloWorld(new AbstractMap.SimpleEntry<>("Foo", "Bar"));
    }
}
