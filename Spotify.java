import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import lejos.nxt.*;
import lejos.util.Delay;

public class Spotify
{

    Graphics g = new Graphics();
    final int SW = LCD.SCREEN_WIDTH;
    final int SH = LCD.SCREEN_HEIGHT;
    final int DELAY = 4000;
    Image logo = new Image(100, 64, new byte[] {
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0xc0, (byte) 0xc0, (byte) 0xc0, (byte) 0xc0, 
		(byte) 0xc0, (byte) 0xc0, (byte) 0xc0, (byte) 0xc0, (byte) 0xc0, 
		(byte) 0x80, (byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0x80, (byte) 0x80, 
		(byte) 0x80, (byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x80, (byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x80, (byte) 0x96, (byte) 0xd2, (byte) 0xd2, 
		(byte) 0xd2, (byte) 0xd2, (byte) 0x92, (byte) 0x96, (byte) 0xa4, 
		(byte) 0x2c, (byte) 0x09, (byte) 0x01, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0xc0, (byte) 0xc0, (byte) 0xc0, (byte) 0xc0, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0xc0, (byte) 0xc0, (byte) 0xc0, 
		(byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0xc0, (byte) 0xe0, (byte) 0xe0, (byte) 0xe0, 
		(byte) 0xe0, (byte) 0xe0, (byte) 0xe0, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x70, (byte) 0xfc, (byte) 0xfe, 
		(byte) 0xff, (byte) 0xcf, (byte) 0x87, (byte) 0x87, (byte) 0x87, 
		(byte) 0x87, (byte) 0x87, (byte) 0x07, (byte) 0x0f, (byte) 0x1f, 
		(byte) 0x3f, (byte) 0x3f, (byte) 0x3f, (byte) 0x00, (byte) 0x00, 
		(byte) 0x38, (byte) 0xf8, (byte) 0xf8, (byte) 0xf8, (byte) 0xf8, 
		(byte) 0xf0, (byte) 0x70, (byte) 0x38, (byte) 0x38, (byte) 0x38, 
		(byte) 0x38, (byte) 0x78, (byte) 0xf8, (byte) 0xf0, (byte) 0xf0, 
		(byte) 0xc0, (byte) 0x00, (byte) 0xf0, (byte) 0xfc, (byte) 0xfe, 
		(byte) 0xff, (byte) 0x3f, (byte) 0x07, (byte) 0x03, (byte) 0x03, 
		(byte) 0x03, (byte) 0x03, (byte) 0x03, (byte) 0x0f, (byte) 0xff, 
		(byte) 0xff, (byte) 0xfe, (byte) 0xf8, (byte) 0x00, (byte) 0x38, 
		(byte) 0x38, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
		(byte) 0x38, (byte) 0x38, (byte) 0x38, (byte) 0x10, (byte) 0x00, 
		(byte) 0x38, (byte) 0x38, (byte) 0xfb, (byte) 0xfb, (byte) 0xfb, 
		(byte) 0xfb, (byte) 0x00, (byte) 0x00, (byte) 0x38, (byte) 0x38, 
		(byte) 0x38, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
		(byte) 0x38, (byte) 0x38, (byte) 0x38, (byte) 0xf8, (byte) 0xf8, 
		(byte) 0xf8, (byte) 0xf8, (byte) 0x38, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x38, (byte) 0xf8, (byte) 0xf8, (byte) 0xf8, 
		(byte) 0xf8, (byte) 0x38, (byte) 0x38, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0xe0, (byte) 0xe1, (byte) 0xe3, 
		(byte) 0xe3, (byte) 0x87, (byte) 0x07, (byte) 0x07, (byte) 0x07, 
		(byte) 0x07, (byte) 0x0f, (byte) 0x0f, (byte) 0x0f, (byte) 0x1f, 
		(byte) 0xff, (byte) 0xfe, (byte) 0xfc, (byte) 0xf8, (byte) 0x00, 
		(byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
		(byte) 0xf3, (byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x80, (byte) 0xf1, (byte) 0xff, (byte) 0xff, 
		(byte) 0xff, (byte) 0x3f, (byte) 0x01, (byte) 0x0f, (byte) 0x1f, 
		(byte) 0x3f, (byte) 0x3f, (byte) 0x78, (byte) 0x78, (byte) 0x70, 
		(byte) 0x70, (byte) 0x70, (byte) 0x78, (byte) 0x3e, (byte) 0x3f, 
		(byte) 0x1f, (byte) 0x0f, (byte) 0x03, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x80, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
		(byte) 0xff, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x80, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x03, 
		(byte) 0x1f, (byte) 0x7f, (byte) 0xff, (byte) 0xf8, (byte) 0xe0, 
		(byte) 0xf0, (byte) 0xfe, (byte) 0xff, (byte) 0x3f, (byte) 0x07, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x3f, (byte) 0x3f, (byte) 0x3f, 
		(byte) 0x3f, (byte) 0x07, (byte) 0x0f, (byte) 0x0f, (byte) 0x1e, 
		(byte) 0x1e, (byte) 0x1e, (byte) 0x1e, (byte) 0x1e, (byte) 0x1f, 
		(byte) 0x0f, (byte) 0x0f, (byte) 0x07, (byte) 0x01, (byte) 0x00, 
		(byte) 0xe0, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 
		(byte) 0xe3, (byte) 0xe3, (byte) 0x07, (byte) 0x07, (byte) 0x07, 
		(byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x03, (byte) 0x01, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x01, (byte) 0x03, (byte) 0x07, (byte) 0x07, 
		(byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x02, (byte) 0x00, 
		(byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x07, 
		(byte) 0x07, (byte) 0x07, (byte) 0x02, (byte) 0x00, (byte) 0x07, 
		(byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x07, 
		(byte) 0x07, (byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0xe0, 
		(byte) 0xe0, (byte) 0xe0, (byte) 0xf3, (byte) 0xff, (byte) 0xff, 
		(byte) 0x7f, (byte) 0x0f, (byte) 0x01, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x01, (byte) 0x01, (byte) 0x01, (byte) 0x01, (byte) 0x01, 
		(byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, 
		(byte) 0x01, (byte) 0x01, (byte) 0x01, (byte) 0x01, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, 
	});
    
    void showLogo()
    {
        LCD.setAutoRefresh(false);
        for (int i = 0; i <= SH; i++)
        {
            g.drawImage(logo, 0, i - SH, 0);
            LCD.refresh();
            Delay.msDelay(20);
        }
        Delay.msDelay(DELAY);
        
        // Remove the image using a split line transition
        for (int i = 0; i < SW; i++)
        {
            g.drawRegionRop(logo, 0, 0, SW, SH, -i, 0, 0, 0x55aa00);
            g.drawRegionRop(logo, 0, 0, SW, SH, i, 0, 0, 0xaa5500);
            LCD.refresh();
        }
        LCD.setAutoRefresh(true);
        LCD.refresh();
        Button.waitForPress(DELAY);
    }

    public static void main(String[] options) throws Exception
    {
        Spotify spotify = new Spotify();
        spotify.showLogo();
    }
}
