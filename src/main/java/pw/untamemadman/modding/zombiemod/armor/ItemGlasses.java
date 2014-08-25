package pw.untamemadman.modding.zombiemod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import pw.untamemadman.modding.zombiemod.creativetab.CreativeTabZombieMod;
import pw.untamemadman.modding.zombiemod.reference.Reference;


public class ItemGlasses extends ItemArmor
{
    public ItemGlasses(ItemArmor.ArmorMaterial material, int armorType, String name)
    {
        super(material, 0, armorType);
        setUnlocalizedName(name);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabZombieMod.ZOMBIEMOD_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem()== Glasses.Glasses)
        {
            return Reference.MOD_ID + ":models/armor/Glasses.png";
        }
        else
        {
            return null;
        }
    }
}