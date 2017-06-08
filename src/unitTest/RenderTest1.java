package unitTest;

import java.awt.Color;

import org.junit.Test;

import elements.AmbientLight;
import geometries.Sphere;
import geometries.Triangle;
import primitives.Point3D;
import renderer.ImageWriter;
import renderer.Render;
import scene.Scene;

public class RenderTest1 {

	@Test
	public void basicRendering(){
		
		Scene scene = new Scene();
				
		scene.addGeometry(new Sphere(50, new Point3D(0.0, 0.0, -150)));
		
		Triangle triangle = new Triangle(new Point3D( 100, 0, -149),
				 						 new Point3D(  0, 100, -149),
				 						 new Point3D( 100, 100, -149));
		
		
		Triangle triangle2 = new Triangle(new Point3D( 100, 0, -149),
				 			 			  new Point3D(  0, -100, -149),
				 			 			  new Point3D( 100,-100, -149));
		
		Triangle triangle3 = new Triangle(new Point3D(-100, 0, -149),
				 						  new Point3D(  0, 100, -149),
				 						  new Point3D(-100, 100, -149));
		
		Triangle triangle4 = new Triangle(new Point3D(-100, 0, -149),
				 			 			  new Point3D(  0,  -100, -149),
				 			 			  new Point3D(-100, -100, -149));
		
		
		//add emotion to each geometric 
				//triangle.set_emmission(new Color(55, 255, 0));
				//triangle2.set_emmission(new Color(0, 88, 255));
				//triangle3.set_emmission(new Color(255, 0 , 99));
				//triangle4.set_emmission(new Color(34, 56, 255));
		
		scene.addGeometry(triangle);
		scene.addGeometry(triangle2);
		scene.addGeometry(triangle3);
		scene.addGeometry(triangle4);
		
		ImageWriter imageWriter = new ImageWriter("Render test", 500, 500, 500, 500);
		
		Render render = new Render(imageWriter, scene);
		
		render.renderImage();
		render.writeToImage();
		
	}
	
	
}
