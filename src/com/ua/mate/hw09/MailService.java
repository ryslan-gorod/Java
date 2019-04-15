package com.ua.mate.hw09;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    Map<String, List<T>> myMap;

    public MailService() {
        this.myMap = new HashMap<>();
    }

    public Map<String, List<T>> getMailBox() {
        return myMap;
    }

    @Override
    public void accept(Sendable<T> sendable) {
        String to = sendable.getTo();
        T content = sendable.getContent();
        if (myMap.containsKey(to)) {
            List<T> tmp = myMap.get(to);
            tmp.add(content);
            myMap.put(to, tmp);
        } else {
            List<T> list = new ArrayList<>();
            list.add(content);
            myMap.put(to, list);
        }
    }
}
