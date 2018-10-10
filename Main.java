package bonus;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Bank[] bankInfo = new Bank[2];
        bankInfo[0] = new User("BG 1111");
        bankInfo[1] = new Admin("BG 2222");

        for (Bank item : bankInfo) {
            if (item.chekIfAccessable(item.getClass())) {
                ((Admin) item).setAccount("modified");
            } else {
                System.out.println(((User) item).getAccount());
            }
        }
        
    }
}

