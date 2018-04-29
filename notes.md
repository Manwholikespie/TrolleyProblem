# 314 HW5
## Requirements
- ~~Use JavaFX~~
- ~~Implement a Class Hierarchy~~
- Implement Polymorphism
- ~~use an Interface~~
- ~~use an Abstract Class~~
- ~~make a GUI~~
- export the project as .jar and run it on different computers.
- ~~reference code if used from external source.~~
- ~~minimum two original classes that are designed specifically for this app.~~

## Ideas on what to make
Fact Seagull that plays music in the background, has an animated seagull to the side, and displays random facts in a label in the center.

Polymorphism: could come in the form of the buttons in the gui. For example, if I had two buttons to load new / previous songs, I could make a Button class and then make a function that would be executed when they were pressed down upon, having the override go forward or backwards in the array of filenames to play.

Class Hierarchy: 

----
Trolley Problem Generator.

```java
public class Student extends Person {
	
}

abstract public class Person implements Victim {
	int age;
	String name;
	String occupation;
	
	@Override
	public String plea() {
		// returns a randomized plea for help
		return "help!";
	}
}

public interface Victim {
	public String plea(); // cries something for help
}
```