package com.kodilla.good.patterns.challenges.Flights;

public class ConnectingFlight {
    private String departure;
    private String arrival;
    private String through;

    public ConnectingFlight(String departure, String arrival, String through) {
        this.departure = departure;
        this.arrival = arrival;
        this.through = through;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getThrough() {
        return through;
    }

    @Override
    public String toString() {
        return "ConnectingFlight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", through='" + through + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConnectingFlight that = (ConnectingFlight) o;

        if (!departure.equals(that.departure)) return false;
        if (!arrival.equals(that.arrival)) return false;
        return through.equals(that.through);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + arrival.hashCode();
        result = 31 * result + through.hashCode();
        return result;
    }
}
