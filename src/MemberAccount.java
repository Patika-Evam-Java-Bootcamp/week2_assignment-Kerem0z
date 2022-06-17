public class MemberAccount {

    private String phoneNumber;
    private String name;
    private String surname;
    private Long id;
    private String code;
    private Double balance;


    public MemberAccount(String name, String surname, Long id, String code, Double balance, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.code = code;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    MemberAccount(String name, String surname, String id, Double balance, String phoneNumber) {
    }

    public MemberAccount() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.name.substring(0, 2) + this.id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = this.phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
