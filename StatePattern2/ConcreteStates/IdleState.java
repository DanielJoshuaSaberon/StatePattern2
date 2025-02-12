package StatePattern2.ConcreteStates;

import StatePattern2.Context.VendingMachineController;
import StatePattern2.StateInterface.VendingMachineState;

public class IdleState  implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachineController machine, double coin) {
        System.out.println("Select an item first before inserting coin");
    }

    @Override
    public void selectItem(VendingMachineController machine, String item) {
        System.out.println("Item Selected: " + item);
        machine.setItem(item);
        System.out.println("Current Balance: " + machine.getBalance());
        machine.setState(new ItemSelectedState());
    }

    @Override
    public void dispenseItem(VendingMachineController machine) {
        System.out.println("Select an item first before dispensing");
    }

    @Override
    public void setOutOfOrder(VendingMachineController machine) {
        System.out.println("Vending machine is now out of order");
        machine.setState(new OutOfOrderState());
    }
}
