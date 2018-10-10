package bonus;

abstract class Bank {
    public String account;

    Bank(String account) {
        this.account = account;
    }

    boolean chekIfAccessable(Object level){
        if(level instanceof Admin){
            return true;
        }else {
            return false;
        }
    }
}
