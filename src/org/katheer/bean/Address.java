package org.katheer.bean;

public class Address {
    private String firstLine;
    private String secondLine;
    private String pin;

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return String.format("%s,\n%17s%s,\n%20s: %s.",  this.getFirstLine(),
                "", this.getSecondLine(), "PIN", this.getPin());
    }
}
