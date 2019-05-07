/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class MemberDirectory {
    
    private ArrayList<Member> memberList;

    public MemberDirectory() {
        memberList = new ArrayList();
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }
   
    
    public Member createMember(String name){
        Member member = new Member();
        member.setName(name);
        memberList.add(member);
        return member;
    }
}