package member.controller;

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.Vip;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private static final int MAX_MEMBERS = 10;
    private List<Member> silverMembers;
    private List<Member> goldMembers;
    private List<Member> vipMembers;

    public MemberRepository() {
        silverMembers = new ArrayList<>();
        goldMembers = new ArrayList<>();
        vipMembers = new ArrayList<>();
    }

    public void insertMember(Member m) {
        if (m >= 10)
    }
}
