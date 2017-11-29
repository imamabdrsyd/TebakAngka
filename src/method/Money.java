package method;

public class Money {
    
    double mymoney = 0.0;
    
    public void addMyMoney(double amount) {
        if(mymoney==0)
            mymoney += amount;
    }
    
    public double takeMyMoney(double amount) {
        mymoney -= amount;
        return mymoney;
    }
    
    public void showMyMoney(){
        System.out.println("My Money now: " + mymoney);
    }

}
