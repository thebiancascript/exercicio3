package exercicio;

public class Carro extends Veiculo {

    public Carro() {
        super();  // chama o construtor da superclasse Veiculo
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }
}


