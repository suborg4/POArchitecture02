package POArchitecture02.task001.RewFabric.Classes.Rewards.Bronze;

import POArchitecture02.task001.RewFabric.Classes.IGameItem;
import POArchitecture02.task001.RewFabric.Classes.ItemGenerator;

public class BronzeFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
