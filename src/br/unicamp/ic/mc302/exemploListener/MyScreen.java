package br.unicamp.ic.mc302.exemploListener;

import br.unicamp.ic.mc302.widget.Button;
import br.unicamp.ic.mc302.widget.Screen;

public class MyScreen extends Screen {

	public MyScreen() {

		Button loginButton = new Button("Login");
		// atribui um listener para o evento de clique
		LoginButtonClickListener onClickListener = new LoginButtonClickListener();
		loginButton.setOnClickListener(onClickListener);

		// atribui um listener para o evento de soltar o botão
		LoginButtonReleaseListener onReleaseListener = new LoginButtonReleaseListener();
		loginButton.setOnReleaseListener(onReleaseListener);

		getButtonList().add(loginButton);
	}
}
