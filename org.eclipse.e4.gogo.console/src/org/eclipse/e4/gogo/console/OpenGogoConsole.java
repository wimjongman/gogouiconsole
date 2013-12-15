package org.eclipse.e4.gogo.console;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

public class OpenGogoConsole {
	@Execute
	public void execute(EPartService partService) {
		MPart part = partService.createPart(GogoConsole.ID);
		partService.showPart(part, PartState.CREATE);
		partService.showPart(part, PartState.ACTIVATE);
	}
}