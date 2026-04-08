package br.com.joaocarloslima;

public class Morango {
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Morango(int tamanho, int tempoDeVida, int tempoDeCrescimento) {
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }
    public void crescer(){
        while(this.tamanho < 4){
            this.tamanho +=1;
            this.tempoDeVida +=1;
            this.tempoDeCrescimento -=1;
        }
    }
    public boolean poderColher(){
        if (this.tamanho == 4){
            return true;
        }
        else {
            return false;
        }
    }


    public String getImagem(){
        return "images/batata" + tamanho + ".png";
    }
}