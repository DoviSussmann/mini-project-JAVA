package elements;

import java.awt.Color;

import primitives.Point3D;
//import java.util.Map;

public class AmbientLight extends Light {
	
	private double _Ka = 0.9;

	//default cons
	public AmbientLight() {
		_color = new Color(255,255,255);
		this._Ka = 0.95;
	}

	//copy cons
	public AmbientLight(AmbientLight aLight) {
		_color = new Color(aLight.getColor().getRGB());
		this._Ka=aLight._Ka;
	}
	
	//full cons
	public AmbientLight(int r, int g, int b) {
		_color = new Color(r, g, b);
	}

	//getters and setters
	
	public Color getColor() {
		return _color;
	}

	public void setColor(Color color) {

		_color = new Color(color.getRGB());
	}

	public double getKa() {

		return _Ka;
	}

	
	//operations
	
	//get intensity
	@Override
	public Color getIntensity() {
		
		int r=(int)(_color.getRed()*_Ka);
		System.out.println(r);
		int g=(int)(_color.getGreen()*_Ka);
		System.out.println(g);
		int b=(int)(_color.getBlue()*_Ka);
		System.out.println(b);
		return new Color(r, g, b);
	}
}