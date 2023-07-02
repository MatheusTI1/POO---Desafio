public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet{
// AparelhoTelefonico
  public void ligar(){
    System.out.println("Fazendo ligação");
  }
  public void atender(){
    System.out.println("Atendendo ligação");
  }
  public void iniciarCorreioVoz (){
    System.out.println("Iniciando correio de voz");
  }
// ReprodutorMusical
  public void tocar(){
    System.out.println("Reproduzindo musica");
  }
  public void pausar(){
    System.out.println("Pausando musica");
  }
  public void selecionarMusica(){
    System.out.println("Selecionando musica");
  }
// NavegadorNaInternet
  public void exibirPagina(){
    System.out.println("Exibindo Página");
  }
  public void adicionarNovaAba(){
    System.out.println("Adicionando nova aba");
  }
  public void atualizarPagina(){
    System.out.println("Atualizando pagina");
  }
// Iphone
  public void ligarIphone(){
    System.out.println("Ligando Iphone");
  }
  public void desligarIphone(){
    System.out.println("Desligando Iphone");
  }
  public void bloquearIphone(){
    System.out.println("Bloqueando Iphone");
  }
  public void desbloquearIphone(){
    System.out.println("Desbloqueando Iphone");
  }

}
