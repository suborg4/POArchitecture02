package POArchitecture02.task001.RewFabric.Classes.Rewards.Gold;

import POArchitecture02.task001.RewFabric.Classes.ItemGenerator;
import POArchitecture02.task001.RewFabric.Classes.IGameItem;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
