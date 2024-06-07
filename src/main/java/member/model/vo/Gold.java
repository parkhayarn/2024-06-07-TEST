package member.model.vo;

public class Gold extends Member implements Buyable{

    public Gold() {
    }

    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public int buy(int price) {
        return 0;
    }

    @Override
    public double calculateInterest() {
        double point = getPoint() * 0.05;
        return point;
    }


}
