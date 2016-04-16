package br.unicamp.ic.mc302.widgetWithExt;

import br.unicamp.ic.mc302.widget.OnClickListener;
import br.unicamp.ic.mc302.widget.OnDoubleClickListener;
import br.unicamp.ic.mc302.widget.OnReleaseListener;

public class Button {

	private String label;

	private OnClickListener onClickListener;
	private OnDoubleClickListener onDoubleClickListener;
	private OnReleaseListener onReleaseListener;

	public Button(String label) {
		this.label = label;
		System.out.println("Botão " + this.label + " criado");
	}

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	public void setOnDoubleClickListener(
			OnDoubleClickListener onDoubleClickListener) {
		this.onDoubleClickListener = onDoubleClickListener;
	}

	public void setOnReleaseListener(OnReleaseListener onReleaseListener) {
		this.onReleaseListener = onReleaseListener;
	}

	public enum EventTypeEnum {
		CLICK, DOUBLE_CLICK, RELEASE;
	}

	public void fireEvent(EventTypeEnum event) {
		switch (event) {
		case CLICK:
			if (this.onClickListener != null) {
				this.onClickListener.onButtonClick();
			}
			break;
		case DOUBLE_CLICK:
			if (this.onDoubleClickListener != null) {
				this.onDoubleClickListener.onButtonDoubleClick();
			}
			break;
		case RELEASE:
			if (this.onReleaseListener != null) {
				this.onReleaseListener.onButtonRelease();
			}
			break;
		}
	}

	public class InternaDeInstancia {
		public String getButtonLabel() {
			return "O nome desse botão é acessível na classe "
					+ "e posso chamá-lo daqui: " + label;
			// Também válido como Button.this.label
		}
	}

	public static class InternaEstatica {
		public String getButtonLabel() {
			return "Essa classe não está atrelada a nenhuma instância.\n"
					+ "Possso imprimir a label do botão aqui?";
		}
	}
}
