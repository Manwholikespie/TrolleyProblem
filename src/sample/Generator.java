package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Generator {
    private String n1;
    private String d1;

    private String n2;
    private String d2;

    private String finalCry;

    public Person[] people = new Person[2];

    public ArrayList<String> names = new ArrayList<String>(Arrays.asList(
            "Robert", "James", "Ryan", "Rick", "Sidney", "Mitchell", "Grace", "Hannah",
            "Logan", "Jerry", "Austin", "Jeff", "Michael", "Thomas", "Sue", "Ben",
            "Alejandro"
    ));

    public ArrayList<String> descs = new ArrayList<String>(Arrays.asList(
            "murderer", "kitten", "clone of yourself", "newborn baby", "student",
            "teacher", "doctor", "chef", "pastor", "member of the Bourgeoisie"
    ));

    public ArrayList<String> cries = new ArrayList<String>(Arrays.asList(
            "Ay carumba!", "Eli Eli Lema Sabachthani?!", "Why couldn't it have been snakes?!",
            "Not a bad death after 4 DAYS on these tracks.", "I didn't do it!", "I'm innocent!",
            "I knew I shouldn't have trusted you!", "Pull it tbh...", "... Thank you ...", "Here we go again..."
    ));

    public Generator() {
        this.n1 = getRandom(names);
        this.n2 = getRandom(names);
        this.d1 = getRandom(descs);
        this.d2 = getRandom(descs);
        this.finalCry = getRandom(cries);

        this.people[0] = new Person(n1, d1);
        this.people[0].set_cry(finalCry);

        this.people[1] = new Person(n2, d2);
        this.people[1].set_cry(finalCry);
    }

    public <T extends String> T getRandom(ArrayList<T> al) {
        Random random = new Random();
        int index = random.nextInt(al.size());
        return al.get(index);
    }

    public String info() {
        String side1 = people[0].get_info();
        String side2 = people[1].get_info();

        String o1 = "You see a trolley rushing towards";
        String o2 = "In front of you is a lever, which lets you redirect the trolley towards";

        String out = o1 + " " + side1 + ". " + o2 + " " + side2 + " instead.";
        return out;
    }
}