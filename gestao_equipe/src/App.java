public class App {
    public static void main(String[] args) throws Exception {

        Viatura carro = new Viatura();
        carro.setNumeroRodas(4);
        carro.setTipoViatura("Carro Desportivo");
        carro.setVelocidadeMaxima(120);


        carro.mostrarInfo();
    }
}
