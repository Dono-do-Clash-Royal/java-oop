public class Barco extends Viatura{

    private boolean temPiscina;


    public Barco() {
        super("Barco", 0, 0, "");
    }
    
    public boolean isTemPiscina() {
        return temPiscina;

    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    } 

    @Override
    public void mostrarInfo() {
        System.out.println("Vou mostrar as informações do carro =?=");
        System.out.println("Tipo do Veiculo: " + getTipoViatura());
        System.out.println("Número de Rodas: " + getNumeroRodas());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima());   
        System.out.println("número da matricula: " + getmatricula());
        if (temPiscina) {
            System.out.println("Tem Piscina :-) ");
        }   else {
            System.out.println("NAO tem piscina:-( ");
        }
    }
    

}
