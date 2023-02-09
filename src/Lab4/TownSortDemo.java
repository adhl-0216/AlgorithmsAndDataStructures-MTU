package Lab4;

import javax.swing.*;
import java.util.*;

public class TownSortDemo {
    public static void main(String[] args) {
        int pos;
        Town[] townsArr = new Town[5];
        townsArr[0] = new Town("Tralee", "Kerry", 23000);
        townsArr[1] = new Town("Macroom", "Cork", 3800);
        townsArr[2] = new Town("Listowel", "Kerry", 4820);
        townsArr[3] = new Town("Adare", "Limerick", 2650);
        townsArr[4] = new Town("Killarney", "Kerry", 14500);

        displayArray(townsArr);

        Arrays.sort(townsArr);
        System.out.println("\nSorted List");
        displayArray(townsArr);

        ArrayList<Town> townArrayList = new ArrayList<>();

        townArrayList.add(new Town("Tralee", "Kerry", 23000));
        townArrayList.add(new Town("Macroom", "Cork", 3800));
        townArrayList.add(new Town("Listowel", "Kerry", 4820));
        townArrayList.add(new Town("Adare", "Limerick", 2650));
        townArrayList.add(new Town("Killarney", "Kerry", 14500));

        System.out.println("\nArrayList");
        displayArrayList(townArrayList);

        String targetName = JOptionPane.showInputDialog("What is the name of the town you are looking for? (Collections.binarySearch())");
        pos = searchArrayListByName(townArrayList, targetName);
        JOptionPane.showMessageDialog(null, String.format("%s %s %d", townArrayList.get(pos).getName(), townArrayList.get(pos).getCounty(), townArrayList.get(pos).getPopulation()), "Search Result", JOptionPane.INFORMATION_MESSAGE);


        Collections.sort(townArrayList);
        System.out.println("\nSorted ArrayList");
        displayArrayList(townArrayList);

        pos = Collections.binarySearch(townArrayList, new Town("Adare", "Limerick", 2650));
        System.out.println(pos);
        System.out.println(townArrayList.get(pos));
    }

    private static void displayArray(Town[] towns) {
        for (Town town : towns) {
            System.out.println(town);
        }
    }

    private static void displayArrayList(ArrayList<Town> towns) {
        for (Town town : towns) {
            System.out.println(town);
        }
    }


    private static int searchArrayListByName(ArrayList<Town> towns, String name){
        towns.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        ArrayList<String> townNames = new ArrayList<>();
        for (Town town : towns) {
            townNames.add(town.getName());
        }
        Collections.sort(townNames);
        return Collections.binarySearch(townNames, name);
    }
}