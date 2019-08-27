package occmod.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

//MAKING YOUR SHOVEL EXTEND MINECRAFT'S SHOVEL CLASS

public class CustomShovel extends ItemSpade {

    public CustomShovel(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

}