package sample;

public class Scenario {

    private Generator g;
    public String conclusion;

    public Scenario() {
        // generate the first scenario.
        this.g = new Generator();
    }

    public String info() {
        return this.g.info();
    }

    public void new_scenario() {
        this.g = new Generator();
    }

    public void kill(int personIndex) {
        Person deadp = this.g.people[personIndex];
        this.conclusion = deadp.name + " has died. The last thing they said was \"" + deadp.cry() + "\"";
    }
}