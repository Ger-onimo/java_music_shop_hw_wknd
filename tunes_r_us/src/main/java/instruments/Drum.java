package instruments;

public class Drum extends Instrument{

    public Drum(String instrumentName, String family, String type, double boughtPrice, double sellPrice) {
        super(instrumentName, family, type, boughtPrice, sellPrice);
    }

    @Override
    public String soundPlayed(){
        return "Doof Doof";
    }
    //
    @Override
    public String instrumentSoundMsg(){
        return super.instrumentSoundMsg() + soundPlayed();
    }
// Inherits from Inheritance class
}

