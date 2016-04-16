package br.unicamp.ic.mc302.widget;

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

	public void fireEvent(String event) {
		if (event.equalsIgnoreCase("click")) {
			if (this.onClickListener != null) {
				this.onClickListener.onButtonClick();
			}
		}
		if (event.equalsIgnoreCase("doubleClick")) {
			if (this.onDoubleClickListener != null) {
				this.onDoubleClickListener.onButtonDoubleClick();
			}
		}
		if (event.equalsIgnoreCase("release")) {
			if (this.onReleaseListener != null) {
				this.onReleaseListener.onButtonRelease();
			}
		}
	}

}
