public class ClientClass  {

    MemberAccountService memberAccountService;
    BillService billService;

    public void processSwitch(int expression)
    {
        switch(expression) {
            case 1:
                MemberAccount memberAccount = new MemberAccount();
                memberAccountService.createAccount(memberAccount);
                break;
            case 2:
                String phoneNumber = null;
                Double balance= null;
                String code= null;
                memberAccountService.updateAccount(code,balance,phoneNumber);
                break;
            case 3:
                code = null;
                memberAccountService.deleteAccount(code);
                break;
            case 4:
                memberAccountService.readAccount();
                break;
            case 5:
                int billType = 0;
                memberAccount = null;
                billService.findBill(billType,memberAccount);
                break;
            case 6:
                billType = 0;
                String memberCode = null;
                billService.cancelPayment(memberCode,billType);
                break;
            case 7:
                billType = 0;
                memberCode = null;
                try {
                    billService.makePayment(memberCode,billType);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                break;
        }
    }
   }