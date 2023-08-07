package POArchitecture02.task001.RewFabric.Classes.Rewards.Bronze;

import POArchitecture02.task001.RewFabric.Classes.IGameItem;

public class Bronze implements IGameItem {
    @Override
    public void open() {
        System.out.println("Bronze!");
    }
}
