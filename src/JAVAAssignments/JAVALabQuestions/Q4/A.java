package JAVAAssignments.JAVALabQuestions.Q4;

import java.applet.*;
import java.awt.*;

public class A extends Applet {
    public void init()
    {
        repaint();
    }

    public void start()
    {

    }

    public void stop()
    {

    }

    public void destroy()
    {

    }
    public void paint(Graphics g)
    {
       g.drawString("Hi",30,30);
       g.drawLine(30,10,70,10);
    }
}
