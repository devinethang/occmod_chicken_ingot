package occmod.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

//MAKING YOUR PICKAXE EXTEND MINECRAFT'S PICKAXE CLASS

public class CustomPickaxe extends ItemPickaxe {

    public CustomPickaxe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

}
