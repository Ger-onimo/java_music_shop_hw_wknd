package instruments;

public class Guitar extends Instrument{


    public Guitar(String instrumentName, String family, String type, double boughtPrice, double sellPrice) {
        super(instrumentName, family, type, boughtPrice, sellPrice);

    }

    @Override
    public String soundPlayed(){
        return "Struummmmm";
    }
// Overrides from IPlay Interface

    @Override
    public String instrumentSoundMsg(){
        return super.instrumentSoundMsg() + soundPlayed();
    }
// directly inherits from Inheritance class
}
