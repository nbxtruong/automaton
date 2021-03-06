package automata.create;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import automata.Automata;

public class GraphWithScroll extends GraphDecorator {

	private JScrollPane scrollPane;

	public GraphWithScroll(Graph decorateComponent) {
		super(decorateComponent);
		scrollPane = new JScrollPane(this.decorateComponent.getComponent());
		scrollPane
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	}

	@Override
	public Component getComponent() {
		return scrollPane;
	}

	@Override
	public void addComponent(Component comp) {
		// TODO Auto-generated method stub
		scrollPane.add(comp);
	}

	@Override
	public void setShapeColor(Color color) {
		// TODO Auto-generated method stub
		this.decorateComponent.setShapeColor(color);
	}

	@Override
	public void setAutomata(Automata automata) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAutomataChanges() {
		// TODO Auto-generated method stub

	}

}
