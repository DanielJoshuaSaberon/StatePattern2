package StatePattern2.Context;

import StatePattern2.ConcreteStates.IdleState;
import StatePattern2.StateInterface.VendingMachineState;
import java.util.*;

public class VendingMachineController {
    private double balance;
    private String item;
    private VendingMachineState state;
    private HashMap<String, Integer> inventory;


    public VendingMachineController(double balance) {
        this.balance = balance;
        this.state = new IdleState();
        this.inventory = new HashMap<>();

        inventory.put("Soda", 5);
        inventory.put("Juice", 3);
        inventory.put("Water", 0);
    }

    public double getBalance() {
        return balance;
    }

    public void setbalance(double coin) {
        this.balance = coin;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public VendingMachineState getState() {
        return state;
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public boolean avaible(String item){
        return inventory.containsKey(item) && inventory.get(item) > 0;
    }

    public void reduceInventoryStock(String item){
        if(inventory.containsKey(item)){
            int stock = inventory.get(item);
            if(stock > 0){
                inventory.put(item, stock -1);
            }
        }
    }

    public void showInventory(){
        System.out.println(inventory);
    }

    public void insertCoin(double coin){
        state.insertCoin(this, coin);
    }

    public void selectItem(String item){
        state.selectItem(this, item);
    }

    public void dispensingItem(){
        state.dispenseItem(this);
    }

    public void setOutOfOrder(){
        state.setOutOfOrder(this);
    }
}
