package member.controller;

public class OverMemberException extends Exception {

    public OverMemberException(){
        System.out.println("Member List is full");
    }
}
