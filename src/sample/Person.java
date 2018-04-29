package sample;

public class Person extends AbstractPerson {
    public Person(String name, String desc) {
        super(name, desc);
    }

    public String get_info() {
        return "a " + this.desc + " named " + this.name;
    }

    @Override
    public String cry() {
        return this.finalCry;
    }

    @Override
    public void set_cry(String c) {
        this.finalCry = c;
    }
}