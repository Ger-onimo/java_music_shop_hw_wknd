package otherItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickSetTest {

    DrumStickSet drumStickSet;

    @Before
    public void before(){
        drumStickSet = new DrumStickSet("Drum Stick Set", 5.50, 10);
    }

    @Test
    public void hasName(){
        assertEquals("Drum Stick Set", drumStickSet.getItemName());
    }

    @Test
    public void hasPriceBoughtFor(){
        assertEquals(5.50, drumStickSet.getBoughtPrice(),0.00);
    }

    @Test
    public void hasPriceWillSellFor(){
        assertEquals(10, drumStickSet.getSellPrice(), 0.00);
    }

    @Test
    public void canChangeSellPrice(){
        drumStickSet.setSellPrice(11);
        assertEquals(11, drumStickSet.getSellPrice(), 0.00);
    }

    @Test
    public void hasMarkupAmount(){
        assertEquals(4.50, drumStickSet.calculateMarkUp(), 0.00);
    }
}
