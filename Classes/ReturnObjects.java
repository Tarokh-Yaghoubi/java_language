package java_language.Classes;

public class ReturnObjects {
    int i;

    ReturnObjects(int i) {
        this.i = i;
    }
    // This method, takes an object, increases its 'i'
    // and returns it.

    ReturnObjects increaseByTen(ReturnObjects s) {
        return new ReturnObjects(s.i+=10);
    }

}

class TestReturnObjects {
    public static void main(String[] args) {
        ReturnObjects r = new ReturnObjects(10);
        ReturnObjects o;
        o = r.increaseByTen(r);
        System.out.println("The value of 'o' is ---->>> " + o.i);
        System.out.println("The value of r.i is --->>> " + r.i);
    }
}
