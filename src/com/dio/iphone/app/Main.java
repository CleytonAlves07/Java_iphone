package com.dio.iphone.app;

import com.dio.iphone.IPhone;

public class Main {
  public static void main(String[] args) {
    IPhone iphone = new IPhone();

    tocarMusica(iphone);
    aparelhoTelefonico(iphone);
    navegadorInternet(iphone);

  }

  private static void tocarMusica(IPhone device) {
    device.tocar();
    device.selecionarMusica("Billionaire");
    device.pausar();
  }

  private static void aparelhoTelefonico(IPhone device) {
    device.ligar();
    device.atender();
    device.iniciarCorreioVoz();
  }

  private static void navegadorInternet(IPhone device) {
    device.exibirPagina("https://www.google.com");
    device.adicionarNovaAba();
    device.atualizarPagina();
  }
}
