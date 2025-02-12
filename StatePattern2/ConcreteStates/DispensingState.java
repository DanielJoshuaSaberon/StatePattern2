package StatePattern2.ConcreteStates;

import StatePattern2.Context.VendingMachineController;
import StatePattern2.StateInterface.VendingMachineState;

public class DispensingState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachineController machine, double coin) {
        System.out.println("You've already inserted a coin, Item now dispensing");
    }

    @Override
    public void selectItem(VendingMachineController machine, String item) {
        System.out.println("Item already being dispensed, can't select another item");
    }

    @Override
    public void dispenseItem(VendingMachineController machine) {
        System.out.println("Dispensing complete!");
        machine.setbalance(0);
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachineController machine) {
        System.out.println("Vending machine is now out of order");
        machine.setState(new OutOfOrderState());
    }
}
