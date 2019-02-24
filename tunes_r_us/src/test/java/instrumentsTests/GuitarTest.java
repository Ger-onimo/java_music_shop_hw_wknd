package instrumentsTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Guitar","String", 50, 100, "Electric");
    }

    @Test
    public void hasInstrumentName(){
        assertEquals("Guitar", guitar.getInstrumentName());
    }

    @Test
    public void hasFamily(){
        assertEquals("String", guitar.getFamily());
    }

    @Test
    public void hasPriceBoughtFor(){
        assertEquals(50, guitar.getBoughtPrice(),0.00);
    }

    @Test
    public void hasPriceWillSellFor(){
        assertEquals(100, guitar.getSellPrice(), 0.00);
    }

    @Test
    public void hasTypeOfGuitar(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canChangeSellPrice(){
        guitar.setSellPrice(110.50);
        assertEquals(110.50, guitar.getSellPrice(), 0.00);
    }

    @Test
    public void playsSound(){
        assertEquals("Struummmmm", guitar.soundPlayed());
    }

    @Test
    public void instrumentSoundMsg(){
        assertEquals("The sound this Guitar makes is Struummmmm", guitar.instrumentSoundMsg());
    }
}
