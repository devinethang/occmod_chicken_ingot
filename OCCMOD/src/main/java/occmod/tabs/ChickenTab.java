package occmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import occmod.Main;
import occmod.init.BlockInit;
import occmod.init.ItemInit;

//MAKING YOUR CREATIVETAB WORK LIKE A CREATIVETAB

public class ChickenTab extends CreativeTabs {
	public static Main instance;
	public static final CreativeTabs chickentab = new ChickenTab("chickentab");
	public static CreativeTabs chickentab_1;

    public ChickenTab(String label) { super("chickentab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.chicken_ingot);
    }
    
}