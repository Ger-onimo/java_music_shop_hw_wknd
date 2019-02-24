package instruments;

public class Guitar extends Instrument{

    private String type;

    public Guitar(String instrumentName, String family, double boughtPrice, double sellPrice, String type) {
        super(instrumentName, family, boughtPrice, sellPrice);
        this.type = type;

    }

    public String getType() {
        return type;
    }

    @Override
    public String soundPlayed(){
        return "Struummmmm";
    }
// 
    @Override
    public String instrumentSoundMsg(){
        return super.instrumentSoundMsg() + soundPlayed();
    }
// Inherits from Inheritance class
}
