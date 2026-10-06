package JogoRPG;

public class Arqueiro extends Personagem {
    private String classe;
    private int flechas;
    private int precisao;

    public Arqueiro( String nome, int vidaMax, int flechas, int precisao) {
        super(nome, vidaMax);
        this.classe = "Arqueiro";
        this.flechas = flechas;
        this.precisao = precisao;
    }

    public boolean atirar() {
        if (flechas <= 0) {
            System.out.println(getNome() + " não possui flechas. O ataque não pode ser realizado.");
            return false;
        }
        flechas--;
        System.out.println(getNome() + " atirou uma flecha com precisão " + precisao
                + "! Flechas restantes: " + flechas);
        return true;
    }

    public int getFlechas() {return this.flechas;}
    public int getPrecisao() {return this.precisao;}

    public void exibirStatus(){
        super.exibirStatus();
        System.out.println("Classe:" + this.classe );
        System.out.println("Flechas:" + this.flechas);
        System.out.println("Precisao:" + this.precisao);
    }
}
