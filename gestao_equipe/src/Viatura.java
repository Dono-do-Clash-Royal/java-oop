public class Viatura {

    private String tipoViatura;
    private int numeroRodas;
    private int velocidadeMaxima;
    
    public Viatura() {
    }

    public Viatura(String tipoViatura, int numeroRodas, int velocidadeMaxima) {
        this.tipoViatura = tipoViatura;
        this.numeroRodas = numeroRodas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getTipoViatura() {
        return tipoViatura;
    }
    public void setTipoViatura(String tipoViatura) {
        this.tipoViatura = tipoViatura;
    }
    public int getNumeroRodas() {
        return numeroRodas;
    }
    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostrarInfo() {
        System.out.println("Tipo do Veiculo: " + this.getTipoViatura());
        System.out.println("Número de Rodas: " + this.getNumeroRodas());
        System.out.println("Tipo do Veiculo: " + this.getVelocidadeMaxima());       
    }
}
