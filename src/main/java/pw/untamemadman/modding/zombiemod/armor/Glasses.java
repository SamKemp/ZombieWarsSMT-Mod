package pw.untamemadman.modding.zombiemod.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import pw.untamemadman.modding.zombiemod.utility.RegisterHelper;


public class Glasses
{
    static ItemArmor.ArmorMaterial GlassesArmorMaterial = EnumHelper.addArmorMaterial("GlassesArmorMaterial", 1, new int[]{5, 0, 0, 0}, 0);

    public static Item Glasses;

    public static void RegisterGlasses()
    {
        Glasses = new ItemGlasses(GlassesArmorMaterial, 0, "Glasses");
        RegisterHelper.registerItem(Glasses);
    }
}
