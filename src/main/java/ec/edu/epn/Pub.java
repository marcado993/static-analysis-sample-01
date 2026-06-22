package ec.edu.epn;

public class Pub {
    public static final String ONE_BEER = "hansa";
    public static final String ONE_CIDER = "grans";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    private static final int RUM_PRICE = 65;
    private static final int GRENADINE_PRICE = 10;
    private static final int LIME_JUICE_PRICE = 10;
    private static final int GREEN_STUFF_PRICE = 10;
    private static final int TONIC_WATER_PRICE = 20;
    private static final int GIN_PRICE = 85;

    public int computeCost(String drink, boolean student, int amount) {

        if (amount > 2 && (GT.equals(drink) || BACARDI_SPECIAL.equals(drink))) {
            throw new TooManyDrinksException("Too many drinks, max 2.");
        }
        int price;
        if (drink.equals(ONE_BEER)) {
            price = 74;
        }
        else if (drink.equals(ONE_CIDER)) {
            price = 103;
        }
        else if (drink.equals(A_PROPER_CIDER)) price = 110;
        else if (drink.equals(GT)) {
            price = GIN_PRICE + TONIC_WATER_PRICE + GREEN_STUFF_PRICE;
        }
        else if (drink.equals(BACARDI_SPECIAL)) {
            price = GIN_PRICE/2 + RUM_PRICE + GRENADINE_PRICE + LIME_JUICE_PRICE;
        }
        else {
            throw new UnknownDrinkException("No such drink exists");
        }
        if (student && (ONE_CIDER.equals(drink) || ONE_BEER.equals(drink) || A_PROPER_CIDER.equals(drink))) {
            price = price - price/10;
        }
        return price*amount;
    }
}
