package com.example.a4reduce6;

public class ReduceException extends Exception {

    private int iZaehler;
    private int iNenner;

    public ReduceException(String message, int iZaehler, int iNenner) {
        super(message);
        this.iZaehler = iZaehler;
        this.iNenner = iNenner;
    }

    public int getiZaehler() {
        return iZaehler;
    }

    public int getiNenner() {
        return iNenner;
    }
}
