package br.unicamp.ic.mc302.exemploClasseAninhada;

import br.unicamp.ic.mc302.widget.Button;
import br.unicamp.ic.mc302.widget.OnClickListener;
import br.unicamp.ic.mc302.widget.OnReleaseListener;
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

	private class LoginButtonClickListener implements OnClickListener {

		@Override
		public void onButtonClick() {
			System.out.println("Cliquei no botão de login!");
		}

	}

	private class LoginButtonReleaseListener implements OnReleaseListener {

		@Override
		public void onButtonRelease() {
			System.out
					.println("Já soltei o botão!! Posso fazer o login agora?");
		}

	}

}
