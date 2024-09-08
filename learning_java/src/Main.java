
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BoxDemo boxDemo = new BoxDemo();
        boxDemo.testBox();
        System.out.println("===========================");

        Dinner dinner = new Dinner();
        dinner.echoAll();
        dinner.setName("Hamburger");
        dinner.setCountry("America");
        dinner.setAge(60);
        dinner.echoAll();
        Dinner dinner1 = new Dinner();
        dinner1.echoAll();

    }
}

class Box {

    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

}

class BoxDemo {
    public static void testBox() {
        Box box1 = new Box();

        box1.depth = 5;
        box1.width = 5;
        box1 .height = 5;
        box1.volume();
    }
}

class Dinner {
    String name;
    String country;
    int age;

    Dinner() {
        name = "Pizza";
        country = "Italy";
        age = 100;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCountry(String name) {
        this.country = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void echoAll() {
        System.out.print("name, country and age are : ");
        System.out.println(name + "  " +  country + "  " + age);
    }

}