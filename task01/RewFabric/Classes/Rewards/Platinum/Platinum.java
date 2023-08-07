package POArchitecture02.task001.RewFabric.Classes.Rewards.Platinum;

import POArchitecture02.task001.RewFabric.Classes.IGameItem;

public class Platinum implements IGameItem {
    @Override
    public void open() {
        System.out.println("Platinum!");
    }
}
