package pw.untamemadman.modding.zombiemod.item;

import net.minecraft.item.ItemFood;
import pw.untamemadman.modding.zombiemod.creativetab.CreativeTabZombieMod;
import pw.untamemadman.modding.zombiemod.reference.Reference;

public class ItemChocolateApple extends ItemFood
{
    public ItemChocolateApple()
    {
        super(15, 1.0F, true);
        this.setUnlocalizedName("ChocolateApple");
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(CreativeTabZombieMod.ZOMBIEMOD_TAB);
        this.setPotionEffect(16, 600, 1, 100);
    }
}