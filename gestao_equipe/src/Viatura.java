public class Viatura {

    private String tipoViatura;
    private int numeroRodas;
    private int velocidadeMaxima;
    private String matricula;
    
    public Viatura() {
    }

    public Viatura(String tipoViatura, int numeroRodas, int velocidadeMaxima, String matricula) {
        this.tipoViatura = tipoViatura;
        this.numeroRodas = numeroRodas;
        this.velocidadeMaxima = velocidadeMaxima;
        this.matricula = matricula;
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
    public String getmatricula() {
        return matricula;
    }
    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }

    public void mostrarInfo() {
        System.out.println("Vou mostrar as informações do carro =?=");
        System.out.println("Tipo do Veiculo: " + this.getTipoViatura());
        System.out.println("Número de Rodas: " + this.getNumeroRodas());
        System.out.println("Velocidade Máxima: " + this.getVelocidadeMaxima());   
        System.out.println("número da matricula: " + this.getmatricula());     
    }
}

