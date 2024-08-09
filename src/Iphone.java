import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone  implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    //Metodos Reprodutor musical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica!");
    }

    //Metodos aparelho telefonico

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Realizando chamada para o numero" + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo uma chamada!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    //Metodos navegador internet
    @Override
    public void exibirPagina(String site) {
        System.out.println("Exibindo pagina do site " + site);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba!");
    }
}
