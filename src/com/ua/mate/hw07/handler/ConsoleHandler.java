package com.ua.mate.hw07.handler;

import com.ua.mate.hw07.dao.Dao;
import com.ua.mate.hw07.di.Inject;
import com.ua.mate.hw07.factory.DaoFactory;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class ConsoleHandler<T> {

    @Inject
    private Dao<T> dao;

    public ConsoleHandler(String property) throws IOException {
        this.dao = new DaoFactory<T>().getDao(property);
    }

    public void handle(T obj) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - save info, 2 - get info, 3 - to exit");
            int consoleChoice = scanner.nextInt();
            switch (consoleChoice) {
                case 1:
                    addInfo(scanner, obj);
                    break;
                case 2:
                    String name = scanner.next();
                    System.out.println(dao.get(name, obj));
                    break;
                case 3:
                    return;
            }
        }
    }

    private void addInfo(Scanner scanner, T obj) {
        System.out.println("Enter information");
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println("Enter " + fields[i]);
            String tmpField = scanner.next();
            fields[i].setAccessible(true);
            Class<?> type = fields[i].getType();
            try {
                if (type.toString().equals("int")){
                    fields[i].setInt(obj,Integer.parseInt(tmpField));
                }
                if (type.toString().equals("class java.lang.String")){
                    fields[i].set(obj,tmpField);
                }
            } catch (IllegalAccessException e) {
                System.out.println("Wrong value");
            }
        }
        dao.save(obj);
    }
}
