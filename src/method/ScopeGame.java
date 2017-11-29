package method;

public class ScopeGame {
    
    public void setX(int x) {
        int y = x;
    }
    
    public void setX(int x, int y){
        y = x;
    }
}
