package JogoRPG;

public class Guerreiro  extends Personagem{
    private String classe;
    private int forca;
    private int armadura;

    public Guerreiro(String nome, int vidaMax, int forca, int armadura){
        super(nome, vidaMax);
        this.classe = "Guerreiro";
        this.forca = forca;
        this.armadura = armadura;
    }

    public void golpear(){
        System.out.println(getNome() + "golpe realizado com força " + this.forca + ".");
    }

    private int getForca(){ return this.forca; }
    private int getArmadura(){ return this.armadura; }

    public void exibirStatus(){
        super.exibirStatus();
        System.out.println("Classe:" + this.classe);
        System.out.println("Forca:" + this.forca);
        System.out.println("Armadura:" + this.armadura);
    }
}

