package pw.untamemadman.modding.zombiemod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import pw.untamemadman.modding.zombiemod.creativetab.CreativeTabZombieMod;
import pw.untamemadman.modding.zombiemod.reference.Reference;


public class ItemSheepArmor extends ItemArmor
{
    public ItemSheepArmor(ArmorMaterial material, int armorType, String name)
    {
        super(material, 0, armorType);
        setUnlocalizedName(name);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabZombieMod.ZOMBIEMOD_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem()== SheepArmor.SheepHelmet || stack.getItem() == SheepArmor.SheepChestplate || stack.getItem() == SheepArmor.SheepBoots)
        {
            return Reference.MOD_ID + ":models/armor/Sheep1.png";
        }
        else if(stack.getItem() == SheepArmor.SheepPants)
        {
            return Reference.MOD_ID + ":models/armor/Sheep2.png";
        }
        else
        {
            return null;
        }
    }
}
