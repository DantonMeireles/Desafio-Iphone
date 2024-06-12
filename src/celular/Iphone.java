package celular;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    public static void main(String[] args) {
        Iphone iphone_teste = new Iphone();
        iphone_teste.ligar("123");
        iphone_teste.atender();
        iphone_teste.exibirPagina("youtube.com");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para o número: "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: "+musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Url do site: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Dando f5 na página");
    }
}
