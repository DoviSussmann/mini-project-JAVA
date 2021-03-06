package scene;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import elements.AmbientLight;
import elements.Camera;
import elements.LightSource;
import geometries.Geometry;

public class Scene {

	private Color _background;
	private AmbientLight _ambientLight;
	private List<Geometry> _geometries = new ArrayList<Geometry>();
	private Camera _camera;
	private double _screenDistance;
	private List<LightSource> _lights = new ArrayList<LightSource>();
	private String _sceneName = "scene";

	// default cons
	public Scene() {
		_background = new Color(0, 0, 0);
		_ambientLight = new AmbientLight();
		_camera = new Camera();
		_screenDistance = 100;
	}

	// copy cons
	public Scene(Scene scene) {
		_background = new Color(scene._background.getRGB());
		_ambientLight = new AmbientLight(scene._ambientLight);
		_camera = new Camera(scene._camera);
		_screenDistance = scene._screenDistance;
		_geometries.addAll(scene._geometries);
		_lights.addAll(scene._lights);
	}

	// full cons
	public Scene(AmbientLight aLight, Color background, Camera camera, double screenDistance) {
		_background = new Color(background.getRGB());
		_ambientLight = new AmbientLight(aLight);
		_camera = new Camera(camera);
		_screenDistance = screenDistance;

	}

	// getters and setters
	public Color getBackground() {
		return _background;
	}

	public AmbientLight getAmbientLight() {
		return _ambientLight;
	}

	public Camera getCamera() {

		return _camera;
	}

	public String getSceneName() {
		return _sceneName;
	}

	public double getScreenDistance() {
		return _screenDistance;

	}

	public void setBackground(Color _background) {
		_background = new Color(_background.getRGB());

	}

	public void setAmbientLight(AmbientLight ambientLight) {
		_ambientLight = new AmbientLight(ambientLight);
	}

	public void setCamera(Camera camera) {
		_camera = new Camera(camera);
	}

	public void setSceneName(String sceneNAme) {
		_sceneName = sceneNAme;
	}

	public void setScreenDistance(double screenDistance) {
		_screenDistance = screenDistance;

	}

	// operations
	public void addGeometry(Geometry geometry) {
		_geometries.add(geometry);
	}

	// get iterator for geometric
	public Iterator<Geometry> getGeometriesIterator() {
		return _geometries.iterator();
	}

	//add new light to the container 
	public void addLight(LightSource light) {
		_lights.add(light);

	}

	//get iterator for the light source container
	public Iterator<LightSource> getLightsIterator() {
		return _lights.iterator();
	}

}
