
import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
public class RemoteClass extends
        UnicastRemoteObject implements RMIinterface {
    RemoteClass() throws RemoteException {
        super();
    }
    public void mixingMusic(String audioName) {
       try {
            JFXPanel j=new JFXPanel();
            String urip=new File("Bring Back.mp4").toURI().toString();
            new MediaPlayer(new Media(urip)).play();    
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
        }
    }
     public void mixingMusdic(String audioName) {
       try {
            JFXPanel j=new JFXPanel();
            String urip=new File("This Night.mpa").toURI().toString();
            new MediaPlayer(new Media(urip)).play();    
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
        }
    
    }
}

