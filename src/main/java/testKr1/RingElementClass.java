package testKr1;

public class RingElementClass implements RingElement {
    private double number;
    private RingElement next;
    public RingElementClass(double number) {
        this.number = number;
        this.next = null;
    }
    public void toGetNextNumber(RingElementClass element) {
        this.next = element;
    }

    @Override
    public double getNumber() {return number;}

    @Override
    public RingElement getNextNumber() {return next;}

    @Override
    public double numberHalve() {return this.number = number / 2.0;}





}
