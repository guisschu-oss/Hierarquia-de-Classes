package JogoRPG;

public class Mago extends Personagem{
    private String classe;
    private int mana;
    private int poderMagico;

    public Mago(String nome, int vidaMax,int mana, int poderMagico) {
        super(nome, vidaMax);
        this.classe = "Mago";
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public boolean lancarMagia() {
        if (mana < 0) {
            System.out.println(getNome() + " não possui mana suficiente para lançar magia. (Mana: " + mana + ")");
            return false;
        }
        mana --;
        System.out.println(getNome() + " lançou uma magia com poder mágico " + poderMagico
                + "! Mana restante: " + mana);
        return true;
    }

    public int getMana() {return this.mana;}
    public int getPoderMagico() {return this.poderMagico;}

    public void exibirStatus(){
        super.exibirStatus();
        System.out.println("Classe: " + this.classe);
        System.out.println("Mana: " + this.mana);
        System.out.println("Poder Magico: " + this.poderMagico);
    }
}
