package pw.untamemadman.modding.zombiemod.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import pw.untamemadman.modding.zombiemod.utility.RegisterHelper;


public class DerpyMask
{
    static ItemArmor.ArmorMaterial DerpyMaskArmorMaterial = EnumHelper.addArmorMaterial("DerpyMaskArmorMaterial", 1, new int[]{0, 0, 0, 0}, 0);

    public static Item DerpyMask;

    public static void RegisterDerpyMask()
    {
        DerpyMask = new ItemDerpyMask(DerpyMaskArmorMaterial, 0, "DerpyMask");
        RegisterHelper.registerItem(DerpyMask);
    }
}
