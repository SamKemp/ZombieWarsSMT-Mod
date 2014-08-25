package pw.untamemadman.modding.zombiemod.utility;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import pw.untamemadman.modding.zombiemod.reference.Reference;

public class RegisterHelper
{
    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, Reference.MOD_ID + "_" + item.getUnlocalizedName().substring(5));
    }
}