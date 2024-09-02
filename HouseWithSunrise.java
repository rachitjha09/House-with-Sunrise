
/**
 * Write a description of class HouseWithSunrise here.
 *
 * @author (Rachit J)
 * @version (9/11/23)
 */
public class HouseWithSunrise
{
    public static void main (String [] args)
    {

        Square s1 = new Square();
        s1.makeVisible();
        s1.moveVertical(165);
        s1.moveHorizontal(300);
        s1.changeSize(500);
        s1.changeColor("blue");
        //System.out.println("Hello world!");
        
        Triangle t1=new Triangle();
        t1.makeVisible();
        t1.moveVertical(-98);
        t1.moveHorizontal(560);
        t1.changeColor("black");
        t1.changeSize(300, 500);
        
        Square windowLeft = new Square();
        windowLeft.makeVisible();
        windowLeft.moveVertical(250);
        windowLeft.moveHorizontal(350);
        windowLeft.changeSize(150);
        windowLeft.changeColor("yellow");
        
        Square windowRight = new Square();
        windowRight.makeVisible();
        windowRight.moveVertical(250);
        windowRight.moveHorizontal(600);
        windowRight.changeSize(150);
        windowRight.changeColor("yellow");
        
        Square doorBottom = new Square();
        doorBottom.makeVisible();
        doorBottom.moveVertical(575);
        doorBottom.moveHorizontal(500);
        doorBottom.changeSize(100);
        doorBottom.changeColor("yellow");
        
        Square doorTop = new Square();
        doorTop.makeVisible();
        doorTop.moveVertical(475);
        doorTop.moveHorizontal(500);
        doorTop.changeSize(100);
        doorTop.changeColor("yellow");
        
        Circle sun = new Circle();
        sun.changeSize(100);
        sun.changeColor("red");
        sun.moveHorizontal(850);
        sun.moveVertical(500);
        sun.makeVisible();
        sun.moveUp();
        //sun.moveRight();
        sun.slowMoveVertical(-500); 
    }
}
