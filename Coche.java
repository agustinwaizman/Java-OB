public class Coche {
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <= 200){
            this.velocidad += cantidad;
        }
        else if(cantidad < 0){
            System.out.println("Como va a ir a menos de 0km/h lokito");
        }
        else{
            System.out.println("paaaraaaa un poco si es un auto, no un avion");
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
