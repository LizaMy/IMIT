package ru.omsu.imit;
//

public class MaxRoot {
    private Polynom polynom;

    public MaxRoot() {
        polynom = new Polynom();
    }

    public MaxRoot(double[] arr) throws ValueDoesntMatchException {
        polynom = new Polynom(arr);
    }

    public double maxRoot() throws ValueDoesntMatchException {
        if (polynom.solve().length == 1) {
            return polynom.solve()[0];
        }
        if (polynom.solve().length == 0) {
            throw new ValueDoesntMatchException("There are no roots!!!");
        }
        if (polynom.solve()[0] > polynom.solve()[1]) {
            return polynom.solve()[0];
        }
        return polynom.solve()[1];
    }


}
