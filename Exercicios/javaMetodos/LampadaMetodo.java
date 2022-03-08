package gabriela.aprendizado.javaMetodos;

public class LampadaMetodo {
    public String marca;
    private String cor;
    private double quantidadeWatt;
    private double consumo;
    private boolean ligada;

    public LampadaMetodo() {
        System.out.println("teste");
    }


    public LampadaMetodo(String marca, String cor, double quantidadeWatt, double consumo, boolean ligada) {
        this.marca = marca;
        this.cor = cor;
        this.quantidadeWatt = quantidadeWatt;
        this.consumo = consumo;
        this.ligada = ligada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuantidadeWatt() {
        return quantidadeWatt;
    }

    public void setQuantidadeWatt(double quantidadeWatt) {
        this.quantidadeWatt = quantidadeWatt;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
        System.out.println("ligada");
    }
    public void desligar(){
        setLigada(false);
        System.out.println("desligada");
    }

    public double calcularConsumo (){

        System.out.println("Método calcularConsumo foi chamado");
        return quantidadeWatt * consumo;
    }



}
