package calcconsole.hw02;

import java.util.Arrays;

public final class ExampleFinalClass {

    private final int id;

    private final String name;

    private final String[] testArrayString;

    public ExampleFinalClass(int id, String name, String[] str) {
        this.id = id;
        this.name = name;
        String[] tmpStr = new String[str.length];
        for (int index = 0; index < str.length; index++) {
            tmpStr[index] = str[index];
        }
        this.testArrayString = tmpStr;
    }

    @Override
    public String toString() {
        return "ExampleFinalClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testArrayString=" + Arrays.toString(testArrayString) +
                '}';
    }
}
