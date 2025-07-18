package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class object_chest extends SuperObject{

	public object_chest() {
		name = "Chest";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
