import java.util.ArrayList;
import java.util.List;

public class MemberAccountService extends MemberAccount {

    private List<MemberAccount> members = new ArrayList<>();

    public MemberAccount createAccount(MemberAccount memberAccount){
        members.add(memberAccount);
        return memberAccount;
    }

    public List<MemberAccount> readAccount(){
        return members;
    }

    public MemberAccount findOneAccount(String code){
        MemberAccount equalsMember = new MemberAccount();
        members.forEach(e -> {
            if (e.getCode().equals(code)) {
                equalsMember.setId(e.getId());
                equalsMember.setName(e.getName());
                equalsMember.setSurname(e.getSurname());
                equalsMember.setBalance(e.getBalance());
                equalsMember.setPhoneNumber(e.getPhoneNumber());
                equalsMember.setCode(e.getCode());
            }
        });
        return equalsMember;
    }


    public MemberAccount updateAccount(String code,Double balance, String phoneNumber ){
        MemberAccount equalsMember = new MemberAccount();
        members.forEach(e -> {
            if (e.getCode().equals(code)) {
                e.setPhoneNumber(phoneNumber);
                e.setBalance(balance);
                equalsMember.setId(e.getId());
                equalsMember.setName(e.getName());
                equalsMember.setSurname(e.getSurname());
                equalsMember.setBalance(balance);
                equalsMember.setPhoneNumber(phoneNumber);
                equalsMember.setCode(code);
            }
        });
        return equalsMember;
    }

    public void deleteAccount(String code){
        for (MemberAccount member : members) {
            if (member.getCode().equals(code)){
                members.remove(member);
            }
        }
    }
}
