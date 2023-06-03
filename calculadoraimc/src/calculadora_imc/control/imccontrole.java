package calculadora_imc.control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calculadora_imc.model.ImcBeam;
import calculadora_imc.view.mainview;

public class imccontrole implements ActionListener {
	private mainview context;
	private ImcBeam imc;
	public imccontrole() {
		
	}
	public imccontrole(mainview context) {
		
		if(this.context == null)
			this.context = context;
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		imc = new ImcBeam(context.getPesotextField().getText(), context.getAlturatextField().getText());
		
		
		context.getResulttextPane().setText(imc.toString());
		
	}

}
