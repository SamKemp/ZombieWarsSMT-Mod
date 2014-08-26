package pw.untamemadman.modding.zombiemod.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import pw.untamemadman.modding.zombiemod.creativetab.CreativeTabZombieMod;
import pw.untamemadman.modding.zombiemod.reference.Reference;
import pw.untamemadman.modding.zombiemod.utility.LogHelper;

/**
 * Created by Sam on 8/25/2014.
 */
public class ItemGlassesUpgrade extends ItemArmor
{
    public ItemGlassesUpgrade(ItemArmor.ArmorMaterial material, int armorType, String name)
    {
        super(material, 0, armorType);
        setUnlocalizedName(name);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabZombieMod.ZOMBIEMOD_TAB);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
    {
        if(!world.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 2, 1, true));
        }
    }
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem()== GlassesUpgrade.GlassesUpgrade)
        {
            return Reference.MOD_ID + ":models/armor/GlassesUpgrade.png";
        }
        else
        {
            return null;
        }
    }
}