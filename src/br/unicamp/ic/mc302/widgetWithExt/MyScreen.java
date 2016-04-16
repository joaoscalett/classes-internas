package br.unicamp.ic.mc302.widgetWithExt;

import java.util.List;

import br.unicamp.ic.mc302.widget.OnClickListener;
import br.unicamp.ic.mc302.widget.OnReleaseListener;

public class MyScreen extends Screen {

	public MyScreen() {
		final String buttonName = "Login";
		Button loginButton = new Button(buttonName);

		List<Button> buttonList = getButtonList();
		// atribui um listener para o evento de clique com a classe anônima
		// diretamente no setter
		loginButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onButtonClick() {
				System.out.println("Cliquei no botão " + buttonName);
			}
		});

		// atribui um listener para o evento de soltar o botão.
		// a classe anônima pode ser colocada em uma variável
		OnReleaseListener onReleaseListener = new OnReleaseListener() {
			@Override
			public void onButtonRelease() {
				System.out.println(
						"Já soltei o botão!! Posso fazer o login agora?");
			}
		};
		loginButton.setOnReleaseListener(onReleaseListener);

		buttonList.add(loginButton);
	}
}
