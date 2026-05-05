public class Cruzeiro extends Barco {
    
    private int numerodequartos;
    private int numerodepisos;
    private String nomedobarco; 
    private boolean temPiscina;


    public int getNumerodequartos() {
        return numerodequartos;
    }    public void setNumerodequartos(int numerodequartos) {
        this.numerodequartos = numerodequartos;
    }    public int getNumerodepisos() {
        return numerodepisos;
    }
    public void setNumerodepisos(int numerodepisos) {
        this.numerodepisos = numerodepisos;
    }
    public String getNomedobarco() {
        return nomedobarco;
    }
    public void setNomedobarco(String nomedobarco) {
        this.nomedobarco = nomedobarco;
    }
    public boolean isTemPiscina() {
           return temPiscina;
    }
    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    public Cruzeiro() {
        super("Cruzeiro", 0, 50, "AB-12-CD");
        this.numerodequartos = 5;
        this.numerodepisos = 3;
        this.nomedobarco = "Miss Lady";
        this.temPiscina = true;
    }


    public void mostrarInfoCruzeiro() {
        System.out.println("Vou mostrar as informações do Cruzeiro =?=");
        super.mostrarInfo();
        System.out.println("número de quartos: " + getNumerodequartos());
        System.out.println("número de pisos: " + getNumerodepisos());
        System.out.println("nome do barco: " + getNomedobarco());

    }   
}
