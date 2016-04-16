package br.unicamp.ic.mc302.widgetWithExt;

import br.unicamp.ic.mc302.widgetWithExt.Button;

public class ExemploMain {

	public static void main(String[] args) {
		// exemplo de séries de eventos ocorrendo na minha aplicação:

		// usuário navega até MyScreen:
		Screen currentScreen = new MyScreen();

		// usuário clica no botão de Login:
		currentScreen.fireEvent(0, Button.EventTypeEnum.CLICK);

		// usuário solta botão de login
		currentScreen.fireEvent(0, Button.EventTypeEnum.RELEASE);

		// Exemplo de classe interna de instância
		Button b = new Button("logout");
		Button.InternaDeInstancia interna = b.new InternaDeInstancia();
		System.out.println(interna.getButtonLabel());

		// Exemplo de classe interna "estática"
		Button.InternaEstatica estatica = new Button.InternaEstatica();
		System.out.println(estatica.getButtonLabel());
	}
}
