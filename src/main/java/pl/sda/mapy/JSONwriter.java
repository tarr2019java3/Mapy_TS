package pl.sda.mapy;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JSONwriter {
    public JSONwriter() {
    }

public void writerMap(String file, Map map ){
    ObjectMapper objectMapper = new ObjectMapper();
    try {
        objectMapper.writeValue(new File(file+".json"), map);
    }
    catch (IOException e)   {
        e.printStackTrace();
    }
}

}

