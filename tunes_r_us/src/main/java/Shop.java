import instruments.Instrument;
import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Instrument> stock;

    public Shop() {
        this.name = "Tunes R Us";
        this.stock = new ArrayList<>();
    }

    public String getName() {
        System.out.println(name);
       return name;

    }

    public int countStock() {
        System.out.println(stock);
        return this.stock.size();
    }

    public void addInstrument(Instrument forSale){
        this.stock.add(forSale);
    }

    public void removeInstrument(Instrument forSale){
        this.stock.remove(forSale);
    }

    public double profit(){
        double totalProfit = 0;
        for(Instrument forSale : this.stock){
           totalProfit += forSale.calculateMarkUp();
        }
        return totalProfit;
    }
}
