package sample;

abstract public class AbstractPerson implements Victim {
    // data specific to the Person
    public String name;
    public String desc;
    public String finalCry;

    public AbstractPerson(String name, String description) {
        // generate a random name and description for them.
        this.name = name;
        this.desc = description;
    }

    @Override
    public String cry() {
        return "help!";
    }
}