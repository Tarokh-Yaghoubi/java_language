
import org.jetbrains.annotations.NotNull;

// With using super(), the SuperClass can keep things private
// such as weight, height, depth and so on...

public class Inheritance {
    public static void main(String[] args) {
        final var myBox1 = new BoxWeight(10, 20, 23, 15);
        final var myColorBox = new ColorBox(12, 15, 16, 0xFF);
        final var myColorBoxBlack  = new ColorBox();
        var inheritBox = new InheritanceBox();

        double vol;

        vol = myBox1.volume();
        System.out.println("The volume of the first box is -> " + vol);
        System.out.println("Weight is -> " + myBox1.weight);
        myColorBox.shoutColor();
        myColorBoxBlack.shoutColor();

        // assign ColorBox reference to InheritanceBox reference
        inheritBox = myColorBox;
        inheritBox.shoutColor();
    }
}

class InheritanceBox {
    private double width;
    private double height;
    private double depth;

    // Construct clone of an object

    InheritanceBox(@NotNull Box obj) {
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    // Constructor used when all dimensions specified
    InheritanceBox(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    InheritanceBox() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    // Constructor used when the cube is created
    InheritanceBox(double len) {
        this.width = this.height = this.depth = len;
    }

    double volume() {
        return this.width * this.height * this.depth;
    }

    void shoutColor() {
        System.out.println("Color is -> BLACK ");
    }
}

// Here, Box is extended to include weight

class BoxWeight extends InheritanceBox {
    double weight;

    BoxWeight(double w, double h, double d, double m) {

        super(w, h, d);
        weight = m;
    }
}

class ColorBox extends InheritanceBox {
    int color; // color of the box

    ColorBox() {
        super();
        color = 0x00;
    }

    ColorBox(double w, double h, double d, int c) {
        super(w, h, d);
        color = c;
    }

    void shoutColor() {
       System.out.println("color is -> " + color);
    }
}
