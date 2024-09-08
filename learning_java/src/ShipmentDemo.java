import org.jetbrains.annotations.NotNull;

class MyBox {
    private double weight;
    private double height;
    private double depth;

    // Constructor, clone of an object
    MyBox(@NotNull MyBox obj) {
        this.weight = obj.weight;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    MyBox(double w, double h, double d) {
        this.weight = w;
        this.height = h;
        this.depth  = d;
    }

    // Constructor used when nothing is specified
    MyBox() {
        this.weight = -1;
        this.height = -1;
        this.depth  = -1;
    }

    // Constructor used when the cube is already created
    MyBox (double len) {
        weight = height = depth = len;
    }

    double volume () {
        return weight * height * depth;
    }
}

class MyBoxWeight extends MyBox {
    double weight;

    MyBoxWeight(MyBoxWeight obj) {
        super(obj);
        this.weight = obj.weight;
    }

    MyBoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        this.weight = m;
    }

    // default constructor
    MyBoxWeight() {
        super();
        this.weight = -1;
    }

    // Constructor used when the box is created

    MyBoxWeight(double len, double w) {
        super(len);
        this.weight = w;
    }
}

// Add Shipping Cost
class Shipment extends MyBoxWeight {
    double cost;

    Shipment(Shipment obj) {
        super(obj);
        this.cost = obj.cost;
    }

    Shipment(double h, double w, double d, double m, double c) {
        super(h, w, d, m);
        this.cost = c;
    }

    Shipment() {
        super();
        this.cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        this.cost = c;
    }

}

public class ShipmentDemo {
    public static void main(String[] args) {

        final var shipment1 = new Shipment(10, 10, 10, 26.3, 156.3);

        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is -> " + vol);
        System.out.println("Weight of shipment1 is -> " + shipment1.weight);
        System.out.println("Shipping Cost is -> $" + shipment1.cost);

    }
}
