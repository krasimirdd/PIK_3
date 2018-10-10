package bonus;

public class Admin extends Bank implements Settable, Gettable {
    Admin(String account) {
        super(account);
    }

    @Override
    public String getAccount() {
        return super.account;
    }

    @Override
    public void setAccount(String account) {
        super.account = account;
    }
}
