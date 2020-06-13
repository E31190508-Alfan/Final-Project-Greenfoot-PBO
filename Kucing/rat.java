import greenfoot.*;
public class rat extends Actor
{
       public void act() 
    {
          setLocation(getX() - 2, getY());
                
         if (getX() <= 0)
         {
                 setLocation(getWorld().getWidth() +getX() , getY());
         }
    }   
}
