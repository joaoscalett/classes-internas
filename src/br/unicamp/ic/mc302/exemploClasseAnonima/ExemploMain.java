package br.unicamp.ic.mc302.exemploClasseAnonima;

import br.unicamp.ic.mc302.widget.Screen;

public class ExemploMain {

	public static void main(String[] args) {
		// exemplo de séries de eventos ocorrendo na minha aplicação:

		// usuário navega até MyScreen:
		Screen currentScreen = new MyScreen();

		// usuário clica no botão de Login:
		currentScreen.fireEvent(0, "click");

		// usuário solta botão de login
		currentScreen.fireEvent(0, "release");
	}
}
