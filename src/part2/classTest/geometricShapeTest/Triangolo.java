package part2.classTest.geometricShapeTest;

public class Triangolo extends MasterShape{

    private double b;
    private double h;
    private double l1;
    private double l2;
    private double l3;

    public Triangolo(double b,double h,double l1,double l2,double l3){
        setB(b);
        setH(h);
        setL1(l1);
        setL2(l2);
        setL3(l3);
    }

    @Override
    public void computeArea() {
        area = b*h/2;
    }

    @Override
    public void computePerimeter() {
        perimeter = l1+l2+l3;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }
}
