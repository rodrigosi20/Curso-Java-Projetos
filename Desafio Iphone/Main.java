public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.selecionarMusica("Musica 1");
        iphone.tocar();
        iphone.pausar();
        
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
