package org.example;

public abstract class HGSPassages {
    private String date;
    private String entryGate;
    private String exitGate;
    private double fee;

    public HGSPassages(String date, String entryGate, String exitGate, double fee) {
        this.date = date;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
        this.fee = fee;
    }

    public String getDate() {
        return date;
    }

    public String getEntryGate() {
        return entryGate;
    }

    public String getExitGate() {
        return exitGate;
    }

    public double getFee() {
        return fee;
    }

    public abstract void recordPassage();
}

