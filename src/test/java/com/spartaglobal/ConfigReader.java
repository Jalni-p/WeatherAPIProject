package com.spartaglobal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConfigReader {
    public static String getConfigKey() {
        try (BufferedReader in = new BufferedReader(new FileReader("src/main/resources/Config.txt")))
        {
            String key = in.readLine().trim();
            return key;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
