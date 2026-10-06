package JogoRPG;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Aragorn", 120, 20, 15);
        Mago mago = new Mago("Gandalf", 80, 100, 30);
        Arqueiro arqueiro = new Arqueiro("Legolas", 90, 20, 25);

        System.out.println("===== STATUS INICIAL =====");
        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();

        System.out.println("\n===== AÇÕES ESPECÍFICAS =====");
        guerreiro.golpear();

        System.out.println("\n-- Mago lança magias até acabar a mana --");
        while (mago.lancarMagia()) {
            // continua enquanto houver mana suficiente
        }

        System.out.println("\n-- Arqueiro atira até acabar as flechas --");
        while (arqueiro.atirar()) {
            // continua enquanto houver flechas
        }

        System.out.println("\n===== AÇÕES GERAIS DE PERSONAGEM =====");
        guerreiro.tomarDano(50);
        guerreiro.curar(20);
        guerreiro.receberMoedas(30);
        guerreiro.subirNivel(1);

        mago.tomarDano(200);      // vida não fica negativa
        mago.curar(35);
        mago.gastarMoeda(40);

        arqueiro.tomarDano(10);
        arqueiro.curar(500);      // vida não passa do máximo
        arqueiro.receberMoedas(50);
        arqueiro.gastarMoeda(1000); // moedas insuficientes

        System.out.println("\n===== STATUS FINAL =====");
        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();
    }
}
