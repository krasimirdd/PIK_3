package bonus;

public class User extends Bank implements Gettable {
    User(String account) {
        super(account);
    }

    @Override
    public String getAccount() {
        return super.account;
    }
}
