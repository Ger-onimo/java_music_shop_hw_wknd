import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;



    public Shop() {
        this.name = "Tunes R Us";
        this.stock = new ArrayList<>();
    }

    public String getName() {
       return name;

    }

    public int countStock() {
        return this.stock.size();
    }

    public void addItem(ISell forSale){
        this.stock.add(forSale);
    }

    public void removeItem(ISell notForSale){
        this.stock.remove(notForSale);
    }

    public double grossProfitProjected(){
        double totalProfit = 0;
        for(ISell forSale : this.stock){
           totalProfit += forSale.calculateMarkUp();
          System.out.println(totalProfit);
        }
        return totalProfit;
    }
}
