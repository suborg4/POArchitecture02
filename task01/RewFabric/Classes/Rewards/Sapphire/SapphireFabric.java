package POArchitecture02.task001.RewFabric.Classes.Rewards.Sapphire;

import POArchitecture02.task001.RewFabric.Classes.IGameItem;
import POArchitecture02.task001.RewFabric.Classes.ItemGenerator;

public class SapphireFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}
