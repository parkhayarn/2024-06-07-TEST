package member.controller;

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.run.Run;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private static final int MAX_MEMBERS = 10;
    List<Member> members = new ArrayList<>();

    public void insertMember(Member m) {
        members.add(m);
        try{
            if (members.size() >= MAX_MEMBERS){
                throw new OverMemberException();
            };
        } catch (Exception e){}

        }

    public void printData() {
//        System.out.println(members.size());
        for (Member m : members) {
            if(m.getGrade() == "Silver") {
                System.out.println(m.getGrade() + "등급 회원 " + m.getName() + "의 포인트는" + m.getPoint() + "이고, 이자포인트는" + m.calculateInterest() + "입니다.");
            }else if(m.getGrade() == "Gold"){
                System.out.println(m.getGrade() + "등급 회원 " + m.getName() + "의 포인트는" + m.getPoint() + "이고, 이자포인트는" + m.calculateInterest() + "입니다.");
            } else if(m.getGrade() == "Vip") {
                System.out.println(m.getGrade() + "등급 회원 " + m.getName() + "의 포인트는" + m.getPoint() + "이고, 이자포인트는" + m.calculateInterest() + "입니다.");
            }
            }
        }
    }
