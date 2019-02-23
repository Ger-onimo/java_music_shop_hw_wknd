package instruments;

public abstract class Instrument {

    private String family;
    private double boughtPrice;
    private double sellPrice;

    public Instrument(String family, double boughtPrice, double sellPrice) {
        this.family = family;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
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

}
