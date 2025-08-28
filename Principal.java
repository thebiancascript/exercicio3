package exercicio;

public class Principal {
    public static void main(String[] args) {
        Pista pista = new Pista();

        Veiculo v = new Veiculo();
        Carro c = new Carro();
        Bicicleta b = new Bicicleta();

        pista.iniciarCorrida(v);  // Veículo acelerando...
        pista.iniciarCorrida(c);  // Carro acelerando...
        pista.iniciarCorrida(b);  // Bicicleta acelerando...
    }
}
