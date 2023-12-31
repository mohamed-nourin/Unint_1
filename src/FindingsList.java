import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException{

        Thread.sleep(500);

        System.out.println("Welcome back!");

        List<String> items = new ArrayList<String>();

        items.add("rock");
        items.add("weird rock");
        items.add("smooth rock");
        items.add("not rock");

        System.out.println(items);

        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");

        items.remove("not rock");

        System.out.println(items);


        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded");

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        Thread.sleep(700);

        Set<String> set = new HashSet<>();

        set.add("toothbrush");
        set.add("water bottle");
        set.add("notepad");

        System.out.println("Supplies before expedition: " + set);

        set.remove("notepad");
        System.out.println("Supplies after expedition: " + set);
    }
}