//  4. Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()

import java.util.ArrayList;
import java.util.List;

public class ColorSublist {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add different color names to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original list of colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Extract 1st and 2nd elements using subList (index 0 to 2 exclusive)
        List<String> subColors = colors.subList(0, 2);

        // Display the extracted sublist
        System.out.println("\nExtracted sublist (1st and 2nd elements):");
        for (String color : subColors) {
            System.out.println(color);
        }
    }
}
 
    

