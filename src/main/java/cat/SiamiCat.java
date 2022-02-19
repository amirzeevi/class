package cat;

public class SiamiCat extends Cat {
    private final String favoriteFood;

    public SiamiCat(String name, int mustageLength, String mustageColor, String favoriteFood) {
        super(name, mustageLength, mustageColor);
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   favoriteFood = " + favoriteFood;
    }
}
