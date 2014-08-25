package pw.untamemadman.modding.zombiemod.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import pw.untamemadman.modding.zombiemod.utility.RegisterHelper;

public class SheepArmor
{
    static ItemArmor.ArmorMaterial SheepArmorMaterial = EnumHelper.addArmorMaterial("SheepArmorMaterial", 50, new int[]{5, 10, 8, 5}, 50);

    public static Item SheepHelmet;
    public static Item SheepChestplate;
    public static Item SheepPants;
    public static Item SheepBoots;

    public static void RegisterSheepArmor()
    {
        SheepHelmet = new ItemSheepArmor(SheepArmorMaterial, 0, "SheepHelmet");
        SheepChestplate = new ItemSheepArmor(SheepArmorMaterial, 1, "SheepChestplate");
        SheepPants  = new ItemSheepArmor(SheepArmorMaterial, 2, "SheepPants");
        SheepBoots  = new ItemSheepArmor(SheepArmorMaterial, 3, "SheepBoots");

        RegisterHelper.registerItem(SheepHelmet);
        RegisterHelper.registerItem(SheepChestplate);
        RegisterHelper.registerItem(SheepPants);
        RegisterHelper.registerItem(SheepBoots);
    }

}
