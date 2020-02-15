package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private double aLength;

    public Square(double aLength) {
        this.name = name;
        this.aLength = aLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.aLength, aLength) != 0) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(aLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(aLength, 2);
    }
}
