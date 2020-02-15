package com.kodilla.testing.shape;

public class triangle implements Shape {
    private String name;
    private double aLength;
    private double hLength;

    public triangle(double aLength, double hLength) {
        this.name = name;
        this.aLength = aLength;
        this.hLength = hLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        triangle triangle = (triangle) o;

        if (Double.compare(triangle.aLength, aLength) != 0) return false;
        if (Double.compare(triangle.hLength, hLength) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(aLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(hLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return aLength/2*hLength;
    }
}
