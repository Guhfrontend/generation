package todolist.model.terrestre;

import todolist.model.Transporte;

public class Terrestre extends Transporte {

    private int numeroRodas;
    private float velocidade;

    public Terrestre() {
        super();
    }

    public Terrestre(int capacidade, int numeroDeRodas, float velocidade) {
        super(capacidade);
        this.numeroRodas = numeroDeRodas;
        this.velocidade = velocidade;
    }

    public int getNumeroDeRodas() {
        return numeroRodas;
    }

    public void setNumeroDeRodas(int numeroDeRodas) {
        this.numeroRodas = numeroDeRodas;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void visualizar() {

        super.visualizar();
        System.out.println("Número de rodas: " + this.numeroRodas);
        System.out.println("Velocidade: " + this.velocidade);

    }

}
