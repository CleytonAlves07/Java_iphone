package com.dio.iphone;

import com.dio.iphone.interfaces.AparelhoTelefonico;
import com.dio.iphone.interfaces.NavegadorInternet;
import com.dio.iphone.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

  @Override
  public void tocar() {
    System.out.println("Tocando música...");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música...");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando música: " + musica);
  }

  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba...");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página...");
  }

  @Override
  public void ligar() {
    System.out.println("Ligando...");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo...");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
  }
  
}
