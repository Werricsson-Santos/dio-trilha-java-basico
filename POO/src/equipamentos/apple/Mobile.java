package equipamentos.apple;
import equipamentos.navegador.NavegadorInternet;
import equipamentos.telefone.AparelhoTelefonico;
import equipamentos.ipod.ReprodutorMusical;

public class Mobile implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    String marca;
    String modelo;

    public void ligar() {
        System.out.println("Ligando " + marca + " " + modelo);
    }
    public void atender() {
        System.out.println("Atendendo...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio eletrônico...");
    }
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
    public void tocar() {
        System.out.println("Tocando musica...");
    }
    public void pausar() {
        System.out.println("pausando musica...");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }
}
