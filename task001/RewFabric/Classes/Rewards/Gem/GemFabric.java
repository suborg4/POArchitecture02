package POArchitecture02.task001.RewFabric.Classes.Rewards.Gem;

import POArchitecture02.task001.RewFabric.Classes.ItemGenerator;
import POArchitecture02.task001.RewFabric.Classes.IGameItem;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
