package com.ua.mate.hw07.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PropertyLoader {

    public static String getProperty(String name) throws IOException {
        Path property = Paths.get("application.properties");
        String propertyFileString = new String(Files.readAllBytes(property));
        String[] tmp = propertyFileString.split("\r\n");
        String result = "";
        String tmpProperty = null;
        String tmpValueProperty = null;
        for (int i = 0; i < tmp.length; i++) {
            tmpProperty = tmp[i].split("=")[0];
            tmpValueProperty = tmp[i].split("=")[1];
            if (tmpProperty.equals(name)) {
                result = tmpValueProperty;
                break;
            }
        }
        return result;
    }
}