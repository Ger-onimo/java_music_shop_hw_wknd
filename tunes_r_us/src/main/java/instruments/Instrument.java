package instruments;

import interfaces.IPlay;
import interfaces.ISell;
import shop.Shop;

public abstract class Instrument extends Shop implements IPlay, ISell {

    private String instrumentName;
    private String family;
    private String type;
    private double boughtPrice; // refactor - move to Shop
    private double sellPrice; // refactor - move to Shop

    public Instrument(String instrumentName, String family, String type, double boughtPrice, double sellPrice) {
        this.instrumentName = instrumentName;
        this.family = family;
        this.type = type;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getFamily() {
        return family;
    }

    public String getType() {
        return type;
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

    public double calculateMarkUp(){
        return getSellPrice() - getBoughtPrice();
    }
}
