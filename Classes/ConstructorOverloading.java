package java_language.Classes;

// Note that in Java we do not have pass-by-pointer,
// Because Java does not support pointers
// We have pass-by-value and pass-by-reference


public class ConstructorOverloading {

    int width;
    int height;
    int depth;

    ConstructorOverloading(){
        width = 5;
        height = 5;
        depth = 5;
    }

    ConstructorOverloading(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    ConstructorOverloading(ConstructorOverloading obj) {
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    double returnVolume() {
        return width * height * depth;
    }

}

class ConstructorOverloadingTest {
    public static void main(String[] args) {
        ConstructorOverloading c = new ConstructorOverloading();
        ConstructorOverloading x = new ConstructorOverloading(15, 35, 16);
        ConstructorOverloading f = new ConstructorOverloading(x);

        double ans = c.returnVolume();
        System.out.println("Answer of returnVolume is "  + ans + " for c");
        ans = x.returnVolume();
        System.out.println("Answer of returnVolume is "  + ans + " for x");
        ans = f.returnVolume();
        System.out.println("Answer of returnVolume is "  + ans + " for f, the same as x");
    }
}
