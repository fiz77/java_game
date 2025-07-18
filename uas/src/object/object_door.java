package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class object_door extends SuperObject{

	public object_door() {
		name = "Door";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/door.png"));
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
