package latihanbasic;

public class DaMethod {

    public static void main(String[] args) {
        sayHelloToRaisa();
        sayHelloTo("Tinki Winki");
        say("Good Afternoon", "Poo");
    }
    public static void sayHelloToRaisa() { // tanpa parameter
        System.out.println("Hello Raisa");
    }
    public static void sayHelloTo(String nama){ // satu parameter
        System.out.println("Hello" + nama);
    }
    public static void say(String message, String nama) { // 2 parameter
        String greeting = message + " " + nama;
        System.out.println(greeting);
    }
    public static void sayMore(String greeting, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(greeting);
        }
    }
}

// Dalam Java, dianjurkan
// Method = kata kerja
// Variable = kata benda

// parameter untuk proses di dalam method