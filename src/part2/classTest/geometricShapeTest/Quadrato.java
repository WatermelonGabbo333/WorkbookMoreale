package part2.classTest.geometricShapeTest;

public class Quadrato extends MasterShape {

    private double l;

    public Quadrato(double l){
       setL(l);
    }

    @Override
    public void computeArea(){
        area = this.l*this.l;
    }

    @Override
    public void computePerimeter() {
        perimeter = 4*this.l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
