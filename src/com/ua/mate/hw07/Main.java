package com.ua.mate.hw07;

import com.ua.mate.hw07.di.*;
import com.ua.mate.hw07.handler.ConsoleHandler;
import com.ua.mate.hw07.model.Client;
import com.ua.mate.hw07.model.Human;
import com.ua.mate.hw07.service.PropertyLoader;

import java.io.IOException;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        String property = PropertyLoader.getProperty("db.name");
        String propertyClass = PropertyLoader.getProperty("db.class");
        ConsoleHandler consoleHandler = new ConsoleHandler(property);
        Injector injector = new Injector();
        Human human = new Human("",0);
        Client client = new Client("","");
        if (propertyClass.equals("Human")){
            consoleHandler.handle(human);
            injector.injectDependency(human,property);
        }
        if (propertyClass.equals("Client")){
            consoleHandler.handle(client);
            injector.injectDependency(client,property);
        }
    }
}
