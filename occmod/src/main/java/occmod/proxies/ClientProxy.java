package occmod.proxies;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import occmod.handlers.RegistryHandler;

public class ClientProxy extends CommonProxy {

    public void PreInt(FMLPreInitializationEvent event) {
        super.PreInt(event);
    }
    public void init(FMLInitializationEvent event) {
        super.init(event);
        RegistryHandler.Client();
    }
    
    public void postinit(FMLPostInitializationEvent event) {
        super.postinit(event);
    }
}
