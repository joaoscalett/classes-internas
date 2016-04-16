package br.unicamp.ic.mc302.widgetWithExt;

import java.util.ArrayList;
import java.util.List;

import br.unicamp.ic.mc302.widgetWithExt.Button.EventTypeEnum;

public class Screen {
	private List<Button> buttonList;

	protected List<Button> getButtonList() {
		if (this.buttonList == null) {
			this.buttonList = new ArrayList<Button>();
		}
		return buttonList;
	}

	public void fireEvent(int target, EventTypeEnum event) {
		// repassa o evento para o item alvo
		this.buttonList.get(target).fireEvent(event);
	}
}
