package pw.untamemadman.modding.zombiemod.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import pw.untamemadman.modding.zombiemod.utility.RegisterHelper;

/**
 * Created by Sam on 8/25/2014.
 */
public class GlassesUpgrade
{
    static ItemArmor.ArmorMaterial GlassesUpgradeArmorMaterial = EnumHelper.addArmorMaterial("GlassesUpgradeArmorMaterial", 1, new int[]{5, 0, 0, 0}, 0);

    public static Item GlassesUpgrade;

    public static void RegisterGlassesUpgrade()
    {
        GlassesUpgrade = new ItemGlassesUpgrade(GlassesUpgradeArmorMaterial, 0, "GlassesUpgrade");
        RegisterHelper.registerItem(GlassesUpgrade);
    }
}
