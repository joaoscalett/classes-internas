package br.unicamp.ic.mc302.exemploListener;

import br.unicamp.ic.mc302.widget.OnReleaseListener;

public class LoginButtonReleaseListener extends OnReleaseListener {

	@Override
	public void onButtonRelease() {
		System.out.println("Já soltei o botão!! Posso fazer o login agora?");
	}

}
