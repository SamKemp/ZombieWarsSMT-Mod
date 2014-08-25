package pw.untamemadman.modding.zombiemod;
import pw.untamemadman.modding.zombiemod.armor.DerpyMask;
import pw.untamemadman.modding.zombiemod.armor.Glasses;
import pw.untamemadman.modding.zombiemod.armor.GlassesUpgrade;
import pw.untamemadman.modding.zombiemod.armor.SheepArmor;
import pw.untamemadman.modding.zombiemod.handeler.ConfigHandeler;
import pw.untamemadman.modding.zombiemod.init.ModBlocks;
import pw.untamemadman.modding.zombiemod.init.ModItems;
import pw.untamemadman.modding.zombiemod.init.Recipes;
import pw.untamemadman.modding.zombiemod.proxy.IProxy;
import pw.untamemadman.modding.zombiemod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUIFactoryClass)
public class ZombieMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static ZombieMod instances;
    @SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
    public static IProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandeler.init(event.getSuggestedConfigurationFile());
        ModBlocks.init();
        ModItems.init();
        SheepArmor.RegisterSheepArmor();
        DerpyMask.RegisterDerpyMask();
        Glasses.RegisterGlasses();
        GlassesUpgrade.RegisterGlassesUpgrade();
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        Recipes.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}