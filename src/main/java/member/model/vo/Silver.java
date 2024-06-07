package member.model.vo;

public class Silver extends Member implements Buyable {
    public Silver() {
    }

    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public int buy(int price) {
        return 0;
    }

    @Override
    public double calculateInterest() {
        double point = getPoint() * 0.02;
                return point;
    }


    }
