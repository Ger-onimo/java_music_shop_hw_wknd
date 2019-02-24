package instruments;

import interfaces.IPlay;

public abstract class Instrument implements IPlay {

    private String instrumentName;
    private String family;
    private double boughtPrice;
    private double sellPrice;

    public Instrument(String instrumentName, String family, double boughtPrice, double sellPrice) {
        this.instrumentName = instrumentName;
        this.family = family;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getFamily() {
        return family;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String instrumentSoundMsg(){
        return "The sound this " + this.instrumentName + " makes is ";
    }


}
