package occmod.init.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

// MAKING YOUR ARMOR EXTEND MINECRAFT'S ARMOR CLASS

public class CustomArmour extends ItemArmor {

    public CustomArmour(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);   
        setRegistryName(name);
    }

}
