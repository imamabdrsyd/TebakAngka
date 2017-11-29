package method;

public class Application {

    public static void main(String[] args) {
        
        
        ScopeGame sc = new ScopeGame();
        sc.setX(5);
        sc.y = 0;
        sc.z = 8;
        
        VariableInClass var = new VariableInClass();
        
        Courier kurir = new Courier();
        double biaya = kurir.hitungBiayaPaket(5, "Bandung", "Express");
        double biaya2 = kurir.hitungBiayaDanAsuransi(56, "Surabaya", "SDS", 34.3 ,62.4);
        System.out.println("Biaya: " + biaya );
        System.out.println("Biaya: " + biaya2 );
        
        // TODO code application logic here
    }
    
}

// keyword "new" berfungsi untuk membuat objek
