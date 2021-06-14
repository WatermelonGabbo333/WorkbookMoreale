package part2.classTest.geometricShapeTest;

public class Quadrato extends MasterShape {

    private double l;

    public Quadrato(double l){
       setL(l);
    }

    @Override
    public double computeArea(){
        area = l*l;
        return area;
    }

    @Override
    public double computePerimeter() {
        perimeter = 4*l;
        return perimeter;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
