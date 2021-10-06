public class BonusMilesService {
    public int calculate (int price) {
        int bonusmileprice = 20;
        int miles = price / bonusmileprice;
        return miles;
    }
}