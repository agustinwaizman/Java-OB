public class CocheMain {
    public static void main(String[] args) {
        Coche auto = new Coche("Negro", "peugeot", "206", 1542.21, 4.2);

        auto.acelerar(140);
        
        System.out.println(auto);
    }
}
