package POArchitecture02.task001.RewFabric.Classes.Rewards.Platinum;

import POArchitecture02.task001.RewFabric.Classes.IGameItem;
import POArchitecture02.task001.RewFabric.Classes.ItemGenerator;

public class PlatinumFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}
