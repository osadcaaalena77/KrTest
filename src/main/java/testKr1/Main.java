package testKr1;

import static java.lang.Math.abs;

public class Main {
    public static void main(String args[]) {
        RingElementClass element5 = new RingElementClass(3.0);
        RingElementClass element4 = new RingElementClass(5.0);
        RingElementClass element3 = new RingElementClass(3.0);
        RingElementClass element2 = new RingElementClass(4.0);
        RingElementClass element1 = new RingElementClass(1.0);

        element5.toGetNextNumber(element1);
        element4.toGetNextNumber(element5);
        element3.toGetNextNumber(element4);
        element2.toGetNextNumber(element3);
        element1.toGetNextNumber(element2);

        RingElement[] ringElements = {element1, element2, element3, element4, element5};

        int count = ringElements.length;
        RingElement current = ringElements[0];
        RingElement prev = current.getNextNumber();

        while(count != 0) {
            current.numberHalve();
            System.out.println("Текущее значение элемента " + current.getNumber());
            prev = current;
            current = current.getNextNumber();
            if (current.getNumber() <= 0.001 && current.getNumber() >= -0.001) {
                prev = current.getNextNumber().getNextNumber();
                count--;
            }
        }
    }
}


