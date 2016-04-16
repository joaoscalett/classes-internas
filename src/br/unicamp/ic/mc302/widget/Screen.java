package br.unicamp.ic.mc302.widget;

import java.util.ArrayList;
import java.util.List;

public class Screen {
	private List<Button> buttonList;

	protected List<Button> getButtonList() {
		if (this.buttonList == null) {
			this.buttonList = new ArrayList<Button>();
		}
		return buttonList;
	}

	public void fireEvent(int target, String event) {
		// repassa o evento para o item alvo
		this.buttonList.get(target).fireEvent(event);
	}
}
