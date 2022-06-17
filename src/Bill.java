import java.time.Instant;
import java.time.LocalDate;

class Bill {

    private Long id;
    private int billType;
    private double amount;
    private Instant processDate;
    private MemberAccount member;

    public Bill(Long id, int billType, double amount, Instant processDate, MemberAccount memberAccount) {
        this.id = id;
        this.billType = billType;
        this.amount = amount;
        this.processDate = processDate;
        this.member = memberAccount;
    }

    public Bill() {

    }

    // Gettsers & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Instant getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Instant processDate) {
        this.processDate = processDate;
    }

    public MemberAccount getMember() {
        return member;
    }

    public void setMember(MemberAccount member) {
        this.member = member;
    }

}
