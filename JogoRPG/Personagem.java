package JogoRPG;

public class Personagem {
    private String nome;
    private int nivel;
    private int moedas;
    private int vidaMax;
    private int vidaAtual;


    public Personagem(String nome, int vidaMax) {
        this.nome = nome;
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaAtual;
        this.nivel = 1;
        this.moedas = 100;
    }

    public void tomarDano(int dano) {
        this.vidaAtual -= dano;
        if (this.vidaAtual < 0) {
            this.vidaAtual = 0;
        }
    }

    public void curar(int cura){
        this.vidaAtual += cura;
        if (this.vidaAtual >= this.vidaMax) {
            this.vidaAtual = this.vidaMax;
        }
    }

    public void subirNivel(int nivel) {
        this.nivel += nivel;
    }

    public void receberMoedas(int moedas) {
        this.moedas += moedas;
    }

    public void gastarMoeda(int valor) {
        if (valor > 0 &&  valor <= this.moedas) {
            this.moedas -= valor;
            System.out.println("Compra realizada! Moedas restantes: " + this.moedas);
        } else {
            System.out.println("Moedas insuficientes ou valor inválido.");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {return this.nome;}
    public int getNivel() {return this.nivel;}
    public int getMoedas() {return this.moedas;}
    public int getVidaMax() {return this.vidaMax;}
    public int getVidaAtual() {return this.vidaAtual;}

    public void exibirStatus(){
        System.out.println("\n----- Status de " + nome + "-----");
        System.out.println("Vida: " + this.vidaAtual + "/" + this.vidaMax);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("Moedas: " + this.moedas);
    }
}