package StatePattern2;

import StatePattern2.Context.VendingMachineController;

public class VendingMachine {
    public static void main(String[]args){
        VendingMachineController machine = new VendingMachineController(0);
        System.out.println("Please Select an item ");
        machine.showInventory();
        machine.selectItem("Soda");
        machine.insertCoin(20);
        machine.insertCoin(5);
        machine.dispensingItem();
        machine.dispensingItem();

        System.out.println("\nPlease Select an item");
        machine.showInventory();
        machine.selectItem("Juice");
        machine.insertCoin(10);
        machine.insertCoin(5);
        machine.dispensingItem();
        machine.dispensingItem();

        System.out.println("\nPlease Select an item");
        machine.showInventory();
        machine.selectItem("Water");
        machine.insertCoin(10);
        machine.dispensingItem();

        System.out.println("\nPlease Select an item");
        machine.showInventory();
        machine.setOutOfOrder();
        machine.selectItem("Water");
        machine.insertCoin(5);
        machine.dispensingItem();
    }
}
