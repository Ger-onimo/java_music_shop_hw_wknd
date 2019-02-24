package instrumentsTests;

import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum("Drum","Percussion","Bass", 80, 160);
    }

    @Test
    public void hasInstrumentName(){
        assertEquals("Drum", drum.getInstrumentName());
    }

    @Test
    public void hasFamily(){
        assertEquals("Percussion", drum.getFamily());
    }

    @Test
    public void hasTypeOfGuitar(){
        assertEquals("Bass", drum.getType());
    }

    @Test
    public void hasPriceBoughtFor(){
        assertEquals(80, drum.getBoughtPrice(),0.00);
    }

    @Test
    public void hasPriceWillSellFor(){
        assertEquals(160, drum.getSellPrice(), 0.00);
    }

    @Test
    public void canChangeSellPrice(){
        drum.setSellPrice(170.50);
        assertEquals(170.50, drum.getSellPrice(), 0.00);
    }

    @Test
    public void playsSound(){
        assertEquals("Doof Doof", drum.soundPlayed());
    }

    @Test
    public void instrumentSoundMsg(){
        assertEquals("The sound this Drum makes is Doof Doof", drum.instrumentSoundMsg());
    }

    @Test
    public void hasMarkupAmount(){
        assertEquals(80, drum.calculateMarkUp(), 0.00);
    }

}

