package ResourceLoader;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Resource {
	public static BufferedImage getImage(String name) {
		try {
			return ImageIO.read(ClassLoader.getSystemResource("res/" + name));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static InputStream getFile(String name) {
		return ClassLoader.getSystemResourceAsStream("res/" + name);
	}
	
}
