package otherItems;

import interfaces.ISell;

public abstract class OtherItem implements ISell {

    String itemName;
    private double boughtPrice;
    private double sellPrice;

    public OtherItem(String itemName, double boughtPrice, double sellPrice) {
        this.itemName = itemName;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getItemName() {
        return itemName;
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

    public double calculateMarkUp(){
        return getSellPrice() - getBoughtPrice();
    }

}
