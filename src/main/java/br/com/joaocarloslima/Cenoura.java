package br.com.joaocarloslima;

public class Cenoura {
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Cenoura(int tamanho, int tempoDeVida, int tempoDeCrescimento) {
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
        return "images/cenoura" + tamanho + ".png";
    }
}
