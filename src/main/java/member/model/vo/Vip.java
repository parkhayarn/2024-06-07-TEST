package member.model.vo;

public class Vip extends Member implements Buyable{
    public Vip() {
    }

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public int buy(int price) {
        return 0;
    }

    @Override
    public double calculateInterest() {
        double point = getPoint() * 0.1;
        return point;
    }
}
