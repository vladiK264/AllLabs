package org.example;

public abstract class Figura {
    public int dlina;
    public abstract int perim();

    Figura(int dlina){
        this.dlina = dlina;
    }
}
