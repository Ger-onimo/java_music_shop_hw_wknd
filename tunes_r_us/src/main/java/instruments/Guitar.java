package instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String instrumentName, String family, String type, double boughtPrice, double sellPrice, int numberOfStrings) {
        super(instrumentName, family, type, boughtPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
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
