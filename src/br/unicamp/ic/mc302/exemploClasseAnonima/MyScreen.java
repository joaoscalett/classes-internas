package br.unicamp.ic.mc302.exemploClasseAnonima;

import br.unicamp.ic.mc302.widget.Button;
import br.unicamp.ic.mc302.widget.OnClickListener;
import br.unicamp.ic.mc302.widget.OnReleaseListener;
import br.unicamp.ic.mc302.widget.Screen;

public class MyScreen extends Screen {

	public MyScreen() {

		Button loginButton = new Button("Login");
		// atribui um listener para o evento de clique com a classe an�nima
		// diretamente no setter
		loginButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onButtonClick() {
				System.out.println("Cliquei no bot�o de login!");
			}
		});

		// atribui um listener para o evento de soltar o bot�o.
		// a classe an�nima pode ser colocada em uma vari�vel
		OnReleaseListener onReleaseListener = new OnReleaseListener() {
			@Override
			public void onButtonRelease() {
				System.out.println(
						"J� soltei o bot�o!! Posso fazer o login agora?");
			}
		};
		loginButton.setOnReleaseListener(onReleaseListener);

		getButtonList().add(loginButton);
	}
}
