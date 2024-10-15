import java.applet.Applet;
import java.awt.Graphics;

/* 
<applet code="HelloWorldApplet.class" width="300" height="100">
</applet>
*/

public class pr37 extends Applet {

    // This method initializes the applet
    @Override
    public void init() {
        System.out.println("Applet Initialized");
    }

    // This method is called when the applet is started
    @Override
    public void start() {
        System.out.println("Applet Started");
    }

    // This method is called to paint the content on the applet
    @Override
    public void paint(Graphics g) {
        // Displaying the message "Hello World" on the applet window
        g.drawString("Hello World", 100, 50);
    }

    // This method is called when the applet is stopped
    @Override
    public void stop() {
        System.out.println("Applet Stopped");
    }

    // This method is called when the applet is destroyed
    @Override
    public void destroy() {
        System.out.println("Applet Destroyed");
    }
}
