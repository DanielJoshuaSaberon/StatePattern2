package StatePattern2.ConcreteStates;

import StatePattern2.Context.VendingMachineController;
import StatePattern2.StateInterface.VendingMachineState;

public class ItemSelectedState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachineController machine, double coin) {
        System.out.println("Inserted coins");
        machine.setbalance(machine.getBalance() + coin);
        System.out.println("Current Balance: " + machine.getBalance());
    }

    @Override
    public void selectItem(VendingMachineController machine, String item) {
        System.out.println("You've already selected an item");
    }

    @Override
    public void dispenseItem(VendingMachineController machine) {
        if (machine.avaible(machine.getItem())) {
            machine.reduceInventoryStock(machine.getItem());
            System.out.println("Item going to dispense...");
            System.out.println("now dispensing..");
            machine.setState(new DispensingState());
        } else {
            System.out.println("Item Unavailable");
            machine.setState(new IdleState());
        }
    }

    @Override
    public void setOutOfOrder(VendingMachineController machine) {
        System.out.println("Vending machine is now out of order");
        machine.setState(new OutOfOrderState());
    }
}
