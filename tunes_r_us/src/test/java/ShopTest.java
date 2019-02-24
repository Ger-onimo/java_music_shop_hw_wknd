import instruments.Drum;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import otherItems.DrumStickSet;
import otherItems.Plectrum;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Drum drum;
    Guitar guitar;
    DrumStickSet drumStickSet;
    Plectrum plectrum;

    @Before
    public void before(){
        shop = new Shop();
        drum = new Drum("Drum","Percussion","Bass", 80, 160);
        guitar = new Guitar("Guitar","String", "Electric",50, 100,6);
        drumStickSet = new DrumStickSet("Drum Stick Set", 5.50, 10);
        plectrum = new Plectrum("Plectrum", 0.75, 1.25);
    }

    @Test
    public void shopHasName() {
        assertEquals("Tunes R Us", shop.getName());
    }

    @Test
    public void canGetStockCount(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddToStock(){
        shop.addItem(drum);
        shop.addItem(guitar);
        shop.addItem(drumStickSet);
        assertEquals(3, shop.countStock());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addItem(drum);
        shop.addItem(guitar);
        shop.addItem(drumStickSet);
        assertEquals(3, shop.countStock());
        shop.removeItem(guitar);
        shop.removeItem(drumStickSet);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canCalculateProjectedGrossProfit(){
        shop.addItem(drum);
        shop.addItem(guitar);
        shop.addItem(drumStickSet);
        shop.addItem(plectrum);
        assertEquals(135, shop.grossProfitProjected(), 0.00);
    }
}
