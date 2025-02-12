package StatePattern2.ConcreteStates;

import StatePattern2.Context.VendingMachineController;
import StatePattern2.StateInterface.VendingMachineState;

public class OutOfOrderState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachineController machine, double coin) {
        System.out.println("Vending machine is now out of order");
    }

    @Override
    public void selectItem(VendingMachineController machine, String item) {
        System.out.println("Vending machine is now out of order");
    }

    @Override
    public void dispenseItem(VendingMachineController machine) {
        System.out.println("Vending machine is now out of order");
    }

    @Override
    public void setOutOfOrder(VendingMachineController machine) {
        System.out.println("Vending machine is now out of order");
    }
}
