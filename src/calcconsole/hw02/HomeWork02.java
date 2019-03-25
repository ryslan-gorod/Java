package calcconsole.hw02;

import javax.sound.midi.SoundbankResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HomeWork02 {
    public static void main(String[] args) {

        // Задача 2.1
        UahDepositCreater createUahDeposit = new UahDepositCreater();
        UsdDepositCreater usdDepositCreater = new UsdDepositCreater();
        EurDepositCreater eurDepositCreater = new EurDepositCreater();
        Manager manager = new Manager();
        manager.setDepositCreater(createUahDeposit);
        manager.makeDeposit();
        Deposit deposit = manager.getDeposit();
        System.out.println(deposit);
        manager.setDepositCreater(usdDepositCreater);
        manager.makeDeposit();
        deposit = manager.getDeposit();
        System.out.println(deposit);
        manager.setDepositCreater(eurDepositCreater);
        manager.makeDeposit();
        deposit = manager.getDeposit();
        System.out.println(deposit);

        //Задача 2.2
        //Анонімний клас - Comparator
        Integer[] array = new Integer[]{5, 3, 6, 4, 8, 2, 7, 1, 9};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        Collections.sort(list);
        System.out.println(list.toString());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                int first = ((Integer) o1).intValue();
                int second = ((Integer) o2).intValue();
                return first < second ? 1 : first == second ? 0 : -1;
            }
        });
        System.out.println(list.toString());
        //вложений клас, статичний вложений клас, локальний клас
        FootballTeam footballTeam = new FootballTeam();
        FootballTeam.Player player = footballTeam.new Player();//вложений клас
        FootballTeam.Federation federation = new FootballTeam.Federation();//статичний вложений клас
        footballTeam.play("Львів", "Україна");//локальний клас
        System.out.println(footballTeam.getPlaceOfGame());

        //Задача 2.3
        int[] arr = new int[]{5, 3, 6, 4, 1, 2, 8, 5, 4, 7, 9, 6, 3, 1, 2, 5, 4, 5, 23, 9, 2, 1, 4, 5};
        //SortUtils.sortIntBubble(arr);
        SortUtils.sortIntСhoice(arr);
        System.out.println(Arrays.toString(SortUtils.sortIntMerge(arr)));

        //Задача 2.4
        ExampleFinalClass exampleFinalClass = new ExampleFinalClass(1, "test", new String[]{"one", "two"});
    }
}
