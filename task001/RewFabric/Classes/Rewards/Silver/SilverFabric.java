package POArchitecture02.task001.RewFabric.Classes.Rewards.Silver;

import POArchitecture02.task001.RewFabric.Classes.IGameItem;
import POArchitecture02.task001.RewFabric.Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
