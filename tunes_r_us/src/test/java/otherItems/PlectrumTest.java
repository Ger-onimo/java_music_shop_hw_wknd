package otherItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlectrumTest {

    Plectrum plectrum;

    @Before
    public void before(){
        plectrum = new Plectrum("Plectrum", 0.75, 1.25);
    }

    @Test
    public void hasName(){
        assertEquals("Plectrum", plectrum.getItemName());
    }

    @Test
    public void hasPriceBoughtFor(){
        assertEquals(0.75, plectrum.getBoughtPrice(),0.00);
    }

    @Test
    public void hasPriceWillSellFor(){
        assertEquals(1.25, plectrum.getSellPrice(), 0.00);
    }

    @Test
    public void canChangeSellPrice(){
        plectrum.setSellPrice(1.50);
        assertEquals(1.50, plectrum.getSellPrice(), 0.00);
    }

    @Test
    public void hasMarkupAmount(){
        assertEquals(.50, plectrum.calculateMarkUp(), 0.00);
    }
}
