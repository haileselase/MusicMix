
import java.rmi.*;
import java.rmi.Naming;
public class ServerMusic{
    public static void main(String args[]){
    try{
        RMIinterface stub=new RemoteClass();
        Naming.rebind("rmi://localhost:1099/MUSIC",stub);
        } catch(Exception e){System.out.println(e);}
     }
}
