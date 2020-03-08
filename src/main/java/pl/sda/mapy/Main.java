package pl.sda.mapy;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Generyka<String> generyka = new Generyka<String>("test" );
        System.out.println(generyka.getFieldl());
        Generyka<Integer> generyka1 = new Generyka<Integer>(5);
        System.out.println(generyka1.getFieldl());
    }
}
