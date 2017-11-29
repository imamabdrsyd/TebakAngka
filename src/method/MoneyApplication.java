package method;

public class MoneyApplication {

    public static void main(String[] args) {
        
        Money uang = new Money();
        uang.addMyMoney(5000.0);
        uang.showMyMoney();;
        
        uang.takeMyMoney(2300.0);
        uang.showMyMoney();
    }
    
}
