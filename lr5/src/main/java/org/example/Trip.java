package org.example;

 class Trip {
    private String destination;
    private Transport transport;

    public Trip(String destination, Transport transport) {
        this.destination = destination;
        this.transport = transport;
    }

    public String getDestination() {
        return destination;
    }

    public Transport getTransport() {
        return transport;
    }

    public String toString() {
        return "Поездка в г. " + destination + " (Транспорт: " + transport + ")";
    }
}



