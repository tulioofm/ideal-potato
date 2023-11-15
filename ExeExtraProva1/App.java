public class App {
    public static void main(String[] args) throws Exception {

        Moto motoHonda = new Moto(120, "Honda", new Pneu(17, "Pirelli"));

        Carro carroFiat = new Carro(160, "Fiat", new Pneu(15, "Michelin"));

        System.out.println("Moto Honda:");
        motoHonda.imprimir();

        System.out.println("\nCarro Fiat:");
        carroFiat.imprimir();
    }
}

class Automovel {
    int velocidade;
    String modelo;

    public Automovel(int velocidade, String modelo) {
        this.velocidade = velocidade;
        this.modelo = modelo;
    }
}

class Pneu {
    int aro;
    String modelo;

    public Pneu(int aro, String modelo) {
        this.aro = aro;
        this.modelo = modelo;
    }
}

class Carro extends Automovel {
    Pneu pneu;

    public Carro(int velocidade, String modelo, Pneu pneu) {
        super(velocidade, modelo);
        this.pneu = pneu;
    }

    public void imprimir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Pneu Aro: " + pneu.aro);
        System.out.println("Pneu Modelo: " + pneu.modelo);
    }
}

class Moto extends Automovel {
    Pneu pneu;

    public Moto(int velocidade, String modelo, Pneu pneu) {
        super(velocidade, modelo);
        this.pneu = pneu;
    }

    public void imprimir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Pneu Aro: " + pneu.aro);
        System.out.println("Pneu Modelo: " + pneu.modelo);
    }
}
