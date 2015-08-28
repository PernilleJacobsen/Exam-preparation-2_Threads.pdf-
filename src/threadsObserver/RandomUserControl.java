package threadsObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import randomperson.RandomUser;
import randomperson.RandomUserGenerator;

public class RandomUserControl extends java.util.Observable
{
    public void fetchRandomUser()
    {
        Thread1 t1 = new Thread1();
        t1.start();
        
        
    }
public class Thread1 extends Thread
{
    public void run()
    {
        RandomUser user = null;
        try
        {
            user = RandomUserGenerator.getRandomUser();
            System.out.println(""+countObservers());
            setChanged();
            notifyObservers(user);

        } catch (InterruptedException ex)
        {
            Logger.getLogger(RandomUserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
}
