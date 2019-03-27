package com.ua.mate.hw03;

public class Role {
    public String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder[] text = new StringBuilder[roles.length];
        for (int i = 0; i < roles.length; i++) {
            text[i] = new StringBuilder(roles[i] + ":\n");
        }
        for (int i = 0; i < roles.length; i++) {
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    int startIndex = roles[i].length() + 1;
                    int endIndex = textLines[j].length() - 1;
                    String tmp = textLines[j].substring(startIndex, endIndex);
                    text[i].append((j + 1) + ")").append(tmp).append("\n");
                }
            }
        }
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < text.length; i++) {
            result.append(text[i].append("\n"));
        }
        return result.toString();
    }
}
