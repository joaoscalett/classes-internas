package br.unicamp.ic.mc302.widgetWithExt;

import br.unicamp.ic.mc302.widgetWithExt.Button;

public class ExemploMain {

	public static void main(String[] args) {
		// exemplo de s�ries de eventos ocorrendo na minha aplica��o:

		// usu�rio navega at� MyScreen:
		Screen currentScreen = new MyScreen();

		// usu�rio clica no bot�o de Login:
		currentScreen.fireEvent(0, Button.EventTypeEnum.CLICK);

		// usu�rio solta bot�o de login
		currentScreen.fireEvent(0, Button.EventTypeEnum.RELEASE);

		// Exemplo de classe interna de inst�ncia
		Button b = new Button("logout");
		Button.InternaDeInstancia interna = b.new InternaDeInstancia();
		System.out.println(interna.getButtonLabel());

		// Exemplo de classe interna "est�tica"
		Button.InternaEstatica estatica = new Button.InternaEstatica();
		System.out.println(estatica.getButtonLabel());
	}
}
