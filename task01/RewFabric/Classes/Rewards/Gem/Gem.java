package POArchitecture02.task001.RewFabric.Classes.Rewards.Gem;

import POArchitecture02.task001.RewFabric.Classes.IGameItem;

public class Gem  implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}
