package cat;

public class StreetCat extends Cat {
    private int numberOfFights;

    public StreetCat(String name, int mustageLength, String mustageColor, int numberOfFights) {
        super(name, mustageLength, mustageColor);
        this.numberOfFights = numberOfFights;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "   numberOfFights = " + numberOfFights;
    }
}

