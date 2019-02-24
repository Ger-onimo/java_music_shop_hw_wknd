import instruments.Drum;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Drum drum;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop();
        drum = new Drum("Drum","Percussion","Bass", 80, 160);
        guitar = new Guitar("Guitar","String", "Electric",50, 100);

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
        shop.addDrum(drum);
        shop.addDrum(guitar);
        assertEquals(2, shop.countStock());
    }
}
