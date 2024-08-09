public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Utilizando reprodutor musical!");
        iphone.selecionarMusica();
        iphone.tocarMusica();
        iphone.pausarMusica();

        System.out.println("\n" +"Utilizando aparelho telefone!");
        iphone.fazerChamada("+55119211213");
        iphone.atenderChamada();
        iphone.iniciarCorreioVoz();

        System.out.println("\n" +"Utilizando navegador internet!");
        iphone.exibirPagina("https://web.dio.me/");
        iphone.atenderChamada();
        iphone.iniciarCorreioVoz();

    }
}