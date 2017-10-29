package headfirst.designpatterns.proxy.gumballmonitor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
        	count = Integer.parseInt(args[1]);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		GumballMachine gumballMachine = new GumballMachine(args[0], count);
        Naming.rebind("//"+args[0],gumballMachine);//registry the service into rmi registry.before really register,should first start up the rmiregistry
		GumballMonitor monitor = new GumballMonitor(gumballMachine);

 
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		monitor.report();
	}
}
