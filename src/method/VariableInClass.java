package method;

public class VariableInClass {
    
    double mymoney = 250000.0; // Member Variable
    
    public void doIt(int x, int y){ // x dan y, local variable
        int doItVar = 9;            // lokal variable
        this.mymoney *= 2;
    }
    
    public void doThis(){
        
    }
}
