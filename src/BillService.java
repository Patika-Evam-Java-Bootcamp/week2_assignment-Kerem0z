import java.util.List;

public class BillService{

    private List<Bill> bills;
    private List<MemberAccount> members;

    private MemberAccountService memberAccountService;

    public Bill createBill(Bill bill) {
        bills.add(bill);
        return bill;
    }

    public Bill findBill(int billType, MemberAccount memberAccount) {
        Bill bill = new Bill();
        bills.forEach(e -> {
            if (e.getBillType() == billType && e.getMember().equals(memberAccount)) {
                bill.setBillType(billType);
                bill.setId(e.getId());
                bill.setBillType(e.getBillType());
                bill.setMember(e.getMember());
                bill.setProcessDate(e.getProcessDate());
            }
        });
        return bill;
    }

    public void makePayment(String memberCode, int billType) throws Exception {
        MemberAccount member = memberAccountService.findOneAccount(memberCode);
        Bill bill = this.findBill(billType, member);

        if (member.getBalance() >= bill.getAmount()) {
            member.setBalance(member.getBalance() - bill.getAmount());
        } else {
            throw new StringIndexOutOfBoundsException();
        }

    }

    public String findBillAndAmount(int billType, MemberAccount memberAccount) {
        Bill bill = new Bill();
        bills.forEach(e -> {
            if (e.getBillType() == billType && e.getMember().equals(memberAccount)) {
                bill.setBillType(billType);
                bill.setId(e.getId());
                bill.setBillType(e.getBillType());
                bill.setMember(e.getMember());
                bill.setProcessDate(e.getProcessDate());
            }
        });
        return "Fatura bulundu " + bill.getId() + " fatura tutarı : " + bill.getAmount();
    }

    public String cancelPayment(String memberCode, int billType) {
        MemberAccount member = memberAccountService.findOneAccount(memberCode);
        Bill bill = this.findBill(billType, member);
        member.setBalance(member.getBalance() + bill.getAmount());
        return "Ödeme iade edildi.";

    }
}
