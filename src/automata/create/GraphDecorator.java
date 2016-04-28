package automata.create;

import java.awt.Component;
import java.util.Vector;

import automata.shape.Shape;

public abstract class GraphDecorator implements Graph {

	protected Graph decorateComponent;

	public GraphDecorator(Graph decorateComponent) {
		this.decorateComponent = decorateComponent;
	}

	@Override
	abstract public Component getComponent();

	@Override
	public void setPaintType(int type) {
		this.decorateComponent.setPaintType(type);
	}

	@Override
	public void recognizeAutomata(String word) {
		this.decorateComponent.recognizeAutomata(word);
	}

	@Override
	public void requestFocus() {
		decorateComponent.requestFocus();
	}

	@Override
	public Vector<Shape> getShapes() {
		return decorateComponent.getShapes();
	}

	@Override
	public void setShapes(Vector<Shape> shapes) {
		decorateComponent.setShapes(shapes);
	}
}
