import equipamentos.apple.Iphone;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Iphone iPhone = new Iphone();
    
    //Métodos de telefone
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
    
    //Métodos de Navegador
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

    //Métodos de reprodutor musical
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
    }
}
