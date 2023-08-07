package POArchitecture02.task001.RewFabric.Classes.Rewards.Ruby;

import POArchitecture02.task001.RewFabric.Classes.IGameItem;
import POArchitecture02.task001.RewFabric.Classes.ItemGenerator;

public class RubyFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}
