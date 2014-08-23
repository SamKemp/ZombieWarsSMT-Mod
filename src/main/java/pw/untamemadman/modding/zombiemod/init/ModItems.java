package pw.untamemadman.modding.zombiemod.init;
import pw.untamemadman.modding.zombiemod.item.ItemButter;
import pw.untamemadman.modding.zombiemod.item.ItemChocolate;
import pw.untamemadman.modding.zombiemod.item.ItemWrap;
import pw.untamemadman.modding.zombiemod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemWrap Butter = new ItemButter();
    public static final ItemWrap Chocolate = new ItemChocolate();
    public static void init()
    {
        GameRegistry.registerItem(Butter, "Butter");
        GameRegistry.registerItem(Chocolate, "Chocolate");
    }
}