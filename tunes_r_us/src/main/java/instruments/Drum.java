package instruments;

public class Drum extends Instrument{

//    private String ;

    public Drum(String instrumentName, String family, String type, double boughtPrice, double sellPrice) {
        super(instrumentName, family, type, boughtPrice, sellPrice);
//        this.type = type;

    }

//    public String getType() {
//        return type;
//    }

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

