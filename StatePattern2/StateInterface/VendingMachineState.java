    package StatePattern2.StateInterface;

    import StatePattern2.Context.VendingMachineController;

    public interface VendingMachineState {
        void insertCoin(VendingMachineController machine, double coin);
        void selectItem(VendingMachineController machine, String item);
        void dispenseItem(VendingMachineController machine);
        void setOutOfOrder(VendingMachineController machine);
    }
