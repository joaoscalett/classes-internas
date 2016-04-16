package br.unicamp.ic.mc302.exemploListener;

import br.unicamp.ic.mc302.widget.Screen;

public class ExemploMain {

	public static void main(String[] args) {
		// exemplo de s�ries de eventos ocorrendo na minha aplica��o:

		// usu�rio navega at� MyScreen:
		Screen currentScreen = new MyScreen();

		// usu�rio clica no bot�o de Login:
		currentScreen.fireEvent(0, "click");

		// usu�rio solta bot�o de login
		currentScreen.fireEvent(0, "release");

		// usu�rio d� um duplo clique no bot�o de login:
		// currentScreen.fireEvent(0, "doubleClick");
		// TODO descomentar. O que acontece?
	}
}
