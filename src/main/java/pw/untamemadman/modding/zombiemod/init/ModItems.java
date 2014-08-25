package pw.untamemadman.modding.zombiemod.init;

import net.minecraft.item.ItemFood;
import pw.untamemadman.modding.zombiemod.item.*;
import pw.untamemadman.modding.zombiemod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemWrap Butter = new ItemButter();
    public static final ItemFood Chocolate = new ItemChocolate();
    public static final ItemWrap Wrapper = new ItemWrapper();
    public static final ItemFood ChocolateApple = new ItemChocolateApple(1, 1.0F, true);
    public static void init()
    {
        GameRegistry.registerItem(Butter, "Butter");
        GameRegistry.registerItem(Chocolate, "Chocolate");
        GameRegistry.registerItem(Wrapper, "Wrapper");
        GameRegistry.registerItem(ChocolateApple, "ChocolateApple");
    }
}