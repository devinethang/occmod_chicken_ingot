package occmod.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import occmod.init.ArmourInit;
import occmod.init.BlockInit;
import occmod.init.ItemInit;
import occmod.init.ToolInit;

public class RegistryHandler {
    
    public static void Client() {
    	ItemInit.register();
    	ToolInit.register();
    	ArmourInit.register();
    	BlockInit.registerRenders();
    }
    
    public static void Common() {
    	
    	ItemInit.init();
    	BlockInit.init();
    	ToolInit.init();
    	ArmourInit.init();
    	ArmourInit.Recipitate();
    	BlockInit.register();
    	ItemInit.Recipitate();
    	BlockInit.Recipitate();
    	ToolInit.Recipitate();

    }
    
}
