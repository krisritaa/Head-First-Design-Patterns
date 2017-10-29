package headfirst.designpatterns.proxy.gumballmonitor;

import java.rmi.RemoteException;

public interface GumballMachineServer {
    String getLocation() throws RemoteException;
    int getCount() throws RemoteException;
    State getState() throws RemoteException;
}
