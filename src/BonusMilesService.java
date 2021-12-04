public class BonusMilesService {
    public int calculate(int priceTicket) {
        int priceBonusMile = 20;
        int miles = priceTicket / priceBonusMile;
        return miles;
    }
}