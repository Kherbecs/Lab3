package a3;
import tage.*;
import org.joml.*;
import tage.input.*; 
import tage.input.action.*; 
import net.java.games.input.*; 
import net.java.games.input.Component.Identifier.*;
import net.java.games.input.Event;
import tage.input.action.AbstractInputAction;

class RollActionRight extends AbstractInputAction {
	private MyGame game;
	private GameObject dol;
	private Matrix4f newRotation, roll;
	private float rollAmount = .001f;
	private Vector3f currU, currV, currN;
	private Matrix3f rotation;
	private Vector3f fwd, up, right;
	private Camera cam;
	public RollActionRight(MyGame g) {
		game = g;
	}
	@Override
	public void performAction(float time, Event e) {
		dol = game.getDolphin();
		dol.setLocalRotation(dol.rollObject(rollAmount*(float)game.getTimeSinceLastFrame(), newRotation));
	}
}