package main;

import object.object_chest;
import object.object_door;
import object.object_key;

public class AssetSetter {

	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		gp.obj[0] = new object_key();
		gp.obj[0].worldX = 23 * gp.tileSize;
		gp.obj[0].worldY = 7 * gp.tileSize;
		
		gp.obj[1] = new object_key();
		gp.obj[1].worldX = 23 * gp.tileSize;
		gp.obj[1].worldY = 40 * gp.tileSize;
		
		gp.obj[2] = new object_key();
		gp.obj[2].worldX = 38 * gp.tileSize;
		gp.obj[2].worldY = 8 * gp.tileSize;	
		
		gp.obj[3] = new object_door();
		gp.obj[3].worldX =  10 * gp.tileSize;
		gp.obj[3].worldY =  11 * gp.tileSize;
		
		gp.obj[4] = new object_door();
		gp.obj[4].worldX =  8 * gp.tileSize;
		gp.obj[4].worldY =  28 * gp.tileSize;
		
		gp.obj[5] = new object_door();
		gp.obj[5].worldX =  12 * gp.tileSize;
		gp.obj[5].worldY =  22 * gp.tileSize;
		
		gp.obj[6] = new object_chest();
		gp.obj[6].worldX =  10 * gp.tileSize;
		gp.obj[6].worldY =  7 * gp.tileSize;
	}
}
