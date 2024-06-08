package member.model.vo;

import static java.lang.Integer.parseInt;

public class Silver extends Member implements Buyable {
    public Silver() {
    }

    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public int buy(int price) {
        double sale = price * 0.02;
       return (int)(price - sale);
    }

    @Override
    public double calculateInterest() {
        double point = getPoint() * 0.02;
                return point;
    }


    }
